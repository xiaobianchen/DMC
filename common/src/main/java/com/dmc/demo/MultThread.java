package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class MultThread {
    private static Object lock = new Object();
    private static boolean flag = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        System.out.println("ThreadA");
                    }

                    if (flag) {
                        flag = false;
                        lock.notify();

                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        System.out.println("ThreadB");
                    }

                    if (!flag) {
                        flag = true;
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}


