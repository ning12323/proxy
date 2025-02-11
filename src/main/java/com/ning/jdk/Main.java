package com.ning.jdk;

import java.lang.reflect.Proxy;

/**
 * @author ning0
 * @date 2025/2/11 下午2:47
 * @description Main
 **/
public class Main {
    public static void main(String[] args) {
        Ning ning = new Ning();
        Rule rule = new Rule(ning);

        Object res = Proxy.newProxyInstance(ning.getClass().getClassLoader(), ning.getClass().getInterfaces(), rule);
        System.err.println(res.getClass());
        if (res instanceof Singer) {
            Singer singer = (Singer) res;
            singer.sing();
            singer.dance();

        }

    }
}
