package com.ning.static1;

/**
 * @author ning0
 * @date 2025/2/11 上午10:06
 * @description Main
 **/
public class Main {
    public static void main(String[] args) {
        Singer singer = new NingProxy();
        singer.sing();
        singer.dance();
    }
}
