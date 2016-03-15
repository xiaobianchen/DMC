package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/10
 */
public class IHelloImpl implements IHello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
