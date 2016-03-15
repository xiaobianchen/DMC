package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class ISequenceImplB implements ISequence {

    private static ThreadLocal<Integer> container = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        container.set(container.get() + 1);
        return container.get();
    }

    public static void main(String[] args) {
        ISequence sequence = new ISequenceImplB();
        ClientThread c1 = new ClientThread(sequence);
        ClientThread c2 = new ClientThread(sequence);
        ClientThread c3 = new ClientThread(sequence);

        c1.start();
        c2.start();
        c3.start();
    }
}
