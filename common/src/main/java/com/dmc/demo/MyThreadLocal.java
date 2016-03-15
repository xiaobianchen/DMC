package com.dmc.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class MyThreadLocal<T> {

    //线程局部变量,为解决多线程并发问题
    private Map<Thread,T> container = Collections.synchronizedMap(new HashMap<Thread, T>());

    protected T initialValue(){return null;}

    public void remove() {
        container.remove(Thread.currentThread());
    }

    public T get(){
        Thread thread = Thread.currentThread();
        T value = container.get(thread);

        if(value == null && !container.containsKey(value)){
            value = initialValue();
            container.put(thread,value);
        }

        return value;
    }

    public void set(T value){
        container.put(Thread.currentThread(), value);
    }
}
