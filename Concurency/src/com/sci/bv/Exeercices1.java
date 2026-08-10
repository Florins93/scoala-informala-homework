package com.sci.bv;

public class Exeercices1 implements Runnable {

    public void run() {
        for (int i = 1; i < 100; i += 5) {
            System.out.println(i + " Exeercices1");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
