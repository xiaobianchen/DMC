package com.dmc.automation;


/**
 * @author xiaobianchen
 * @version 1.0 2015/12/23
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle Time operation
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
