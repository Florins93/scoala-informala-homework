//package com.sci.bv;
//
//public class Exercices implements Runnable {
//
//
//    public void run() {
//        int c=0;
//        String s=" ";
//        for (int i = 1; i < 100; i ++) {
//
//           System.out.println(i + " Exercices");
//            try {
//                // thread to sleep for 1000 milliseconds
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                System.out.println(ex);
//            }
//            c++;
//            s=s+" "+i;
//            if(c%10==0){
//                System.out.println("qqqqqq");
//            }
//        }
//
//    }
//}