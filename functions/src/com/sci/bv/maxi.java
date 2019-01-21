//create a method who find the maximu between some numbers
package com.sci.bv;



public class maxi {

    //create a method who find the maximu between 2 numbers
    public static int getMax(int a,int b) {
            if(a>=b){
                return a;
            } else {
                return b;
            }
        }
    //create a method who find the maximu between 3 numbers using getMax method
    public static int getMax2 (int x,int y,int z) {
        int a = getMax(x,y);
        if(a>=z){
            return a;
        } else {
            return z;}

    }



}
