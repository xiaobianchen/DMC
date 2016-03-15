package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class ClientThread extends Thread{

    private ISequence iSequence;

    public ClientThread(ISequence sequence) {
        this.iSequence = sequence;
    }

    @Override
    public void run() {
        for(int i = 0; i <  3; i++){
            System.out.println(Thread.currentThread().getName() + "=>" + iSequence.getNumber());
        }
    }
}
