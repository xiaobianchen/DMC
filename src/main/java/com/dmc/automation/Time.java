package com.dmc.automation;

/**
 * Created by xiaobianchen on 2015/12/23.
 */
public class Time {

    public static void _wait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
