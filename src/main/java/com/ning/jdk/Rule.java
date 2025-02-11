package com.ning.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ning0
 * @date 2025/2/11 下午2:44
 * @description Rule
 **/
public class Rule implements InvocationHandler {
    private Singer singer;

    public Rule(Singer singer) {
        this.singer = singer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");

        Object invoke = method.invoke(singer, args);

        System.out.println("proxy");
        return invoke;
    }
}
