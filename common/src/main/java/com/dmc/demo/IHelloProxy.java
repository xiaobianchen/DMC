package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/10
 */
public class IHelloProxy implements IHello {

    private IHello hello;

    public IHelloProxy() {
        this.hello = new IHelloImpl();
    }

    @Override
    public void sayHello(String name) {
        before();
        hello.sayHello(name);
        after();
    }

    public void before() {
        System.out.println("Before");
    }

    public void after() {
        System.out.println("After");
    }

    public static void main(String[] args) {
        IHello hello = new IHelloProxy();
        hello.sayHello("ebay");
    }
}
