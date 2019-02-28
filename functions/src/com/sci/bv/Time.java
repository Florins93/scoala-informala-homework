// create a programm who display current time(hour and minutes)
package com.sci.bv;

import java.util.Scanner;

public class Time {

    public String hourAndMinutes(int hour,int minutes) {
        if(hour > 23 || hour <0 || minutes> 59 || minutes < 0){
            throw  new IllegalArgumentException("");
        }

        String hourStr = hour<10?"0"+hour : String.valueOf(hour);
        return hourStr + " : "+minutes;
    }
}
