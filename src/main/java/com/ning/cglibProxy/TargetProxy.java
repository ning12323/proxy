package com.ning.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ning0
 * @date 2025/2/11 下午2:56
 * @description TargetProxy
 **/
public class TargetProxy {

    public static <T> Object getProxy(T t) {
        Enhancer en = new Enhancer(); //帮我们生成代理对象
        en.setSuperclass(t.getClass());
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before method");
                Object invoke = methodProxy.invokeSuper(o, objects);
                System.out.println("after method");
                return invoke;
            }
        });
        return en.create();
    }
}
