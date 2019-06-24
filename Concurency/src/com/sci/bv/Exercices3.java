//package com.sci.bv;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Exercices3 implements Runnable {
//
//    private int number;
//    List<Integer> myList = new ArrayList<>();
//
//    public Exercices3(List<Integer> myList) {
//        this.myList = myList;
//    }
//
//
//    public int getNumber() {
//        return number;
//    }
//
//
//
//    public void run() {
//        Random rand = new Random();
//         number = rand.nextInt(10);
//         myList.add(number);
//        System.out.println(" "+myList);
//    }
//}
