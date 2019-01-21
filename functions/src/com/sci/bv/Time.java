package com.sci.bv;

import java.util.Scanner;

public class Time {

    public static void hourAndMinutes(int a,int b) {
        System.out.println("What time is it?");


        if(a>=0 && a<=23 && b>=0 && b<=59 ){
            System.out.println( " The time is "+ a +": "+b+" now.");
        }else {
            System.out.println(" Incorrect time!");
        }

    }
}
