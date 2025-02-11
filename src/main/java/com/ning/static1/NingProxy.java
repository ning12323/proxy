package com.ning.static1;

/**
 * @author ning0
 * @date 2025/2/11 上午10:06
 * @description NingProxy
 **/
public class NingProxy implements Singer {
    private Ning ning = new Ning();

    @Override
    public void sing() {
        System.out.println("proxy");
        ning.sing();
    }

    @Override
    public void dance() {
        System.out.println("proxy");
        ning.dance();
    }
}
