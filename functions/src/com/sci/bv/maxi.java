package com.sci.bv;



public class maxi {


    public static int getMax(int a,int b) {
            if(a>=b){
                return a;
            } else {
                return b;
            }
        }

    public static int getMax2 (int x,int y,int z) {
        int a = getMax(x,y);
        if(a>=z){
            return a;
        } else {
            return z;}

    }



}
