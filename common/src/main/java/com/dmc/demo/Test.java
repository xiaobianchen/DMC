package com.dmc.demo;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class Test {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);//true
        System.out.println(a.equals(b));//true

        System.out.println("-------------------");

        Integer a1 = new Integer(1);
        Integer b1 = new Integer(1);

        System.out.println(a1 == b1);//false
        System.out.println(a.equals(b1));//true

        Hashtable hashtable = new Hashtable();
        HashMap map = new HashMap();

        ConcurrentHashMap map1 = new ConcurrentHashMap();

        Thread t = new Thread();
        t.start();
        t.run();
        t.getPriority();
    }
}
