package com.dmc.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/10
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;

    private DynamicProxy(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(obj, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("Before");
    }

    public void after() {
        System.out.println("After");
    }

    public static void main(String[] args) {
        IHello hello = new IHelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        IHello helloProxy = dynamicProxy.getProxy();
        helloProxy.sayHello("tester");
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }
}
