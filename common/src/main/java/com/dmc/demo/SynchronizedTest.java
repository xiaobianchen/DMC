package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class SynchronizedTest {

    public synchronized void test1() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void main(String[] args) {
        final SynchronizedTest synchronizedTest = new SynchronizedTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedTest.test1();
            }
        },"test1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedTest.test2();
            }
        },"test2").start();
    }
}
