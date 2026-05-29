package com.sci.bv;

public class Time {

    public static String hourAndMinutes(int hour,int minutes) {
        System.out.println("What time is it?");


        if(hour>=0 && hour<=23 && minutes>=0 && minutes<=59 ){
            return "The time is"+ hour +": "+minutes+" now.";
        }else {
            return " Incorrect time!";
        }

    }
}
