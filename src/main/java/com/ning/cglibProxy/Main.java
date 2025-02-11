package com.ning.cglibProxy;

/**
 * @author ning0
 * @date 2025/2/11 下午3:00
 * @description Main
 **/
public class Main {
    public static void main(String[] args) {
        Target target = (Target) TargetProxy.getProxy(new Target());
        System.out.println(target.getClass().getName());
        target.method1();
        target.method2();
    }
}
