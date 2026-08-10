package com.sci.bv;

public class Buffer {

        private int number = -1;
        private boolean available = false;
        public synchronized int get() {
            while (!available) {
                try {
                    wait(); // Wait for producer to put a value
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            available = false;
            notifyAll();
            return number;

        }

        public synchronized void put (int number) {
            while (available) {
                try {
                    wait(); // Wait for consumer to take value
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.number = number;
            available = true;
            System.out.println("Producatorul a pus:\t" + number);
            notifyAll();

        }
    }


