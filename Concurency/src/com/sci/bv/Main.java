package com.sci.bv;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Exercices r = new Exercices();
//        Thread t = new Thread(r);
//        t.start();

//        Exeercices1 r2 = new Exeercices1();
//        Thread t2 = new Thread(r2);
//        t2.start();
//
//        Exercices2 r3 = new Exercices2();
//        Thread t3 = new Thread(r3);
//        t3.start();




//        List<Integer> list = new ArrayList<>();
//
//        Exercices3 r4 = new Exercices3(list);
//        Thread t4 = new Thread(r4);
//        t4.start();
//        t4.join();
//        Exercices3 r5= new Exercices3(list);
//        Thread t5 = new Thread(r5);
//        t5.start();
//        t5.join();
//        Exercices3 r6 = new Exercices3(list);
//        Thread t6 = new Thread(r6);
//        t6.start();
//        t6.join();
//        Exercices3 r7 = new Exercices3(list);
//        Thread t7 = new Thread(r7);
//        t7.start();
//        t7.join();
//        Exercices3 r8 = new Exercices3(list);
//        Thread t8 = new Thread(r8);
//        t8.start();
//        t8.join();
//
//        Integer sum=0;
//        for(int i =0 ; i<list.size();i++){
//            sum=sum+ list.get(i);
//        }
//
//        System.out.println("  "+ sum);



        Buffer b = new Buffer();
        Thread t1 = new Producator(b);
        t1.start();
        Thread t2 = new Consumator(b);
        t2.start();
        }

    }

