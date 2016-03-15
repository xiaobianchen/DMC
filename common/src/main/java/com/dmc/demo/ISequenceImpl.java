package com.dmc.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/9
 */
public class ISequenceImpl implements ISequence{

    private static int number = 0;

    @Override
    public int getNumber() {
        number = number + 1;
        return number;
    }

    public static void main(String[] args) {
        ISequence sequence = new ISequenceImpl();

        ClientThread c1 = new ClientThread(sequence);
        ClientThread c2 = new ClientThread(sequence);
        ClientThread c3 = new ClientThread(sequence);

        c1.start();
        c2.start();
        c3.start();

    }
}
