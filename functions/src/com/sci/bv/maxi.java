package com.sci.bv;

import java.lang.IllegalArgumentException;

import static java.lang.Float.isNaN;
//create a method who find the maximu between some numbers




public class maxi {

    //create a method who find the max between 2 numbers
    public static int getMax(int a, int b) throws Exception{
        if ((isNaN(a)) || isNaN(b)) {
            throw  new Exception("Insert a number");
        }
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    //create a method who find the max between 3 numbers using getMax method
    public static int getMax2(int x, int y, int z) throws Exception{
        if ((isNaN(x)) || isNaN(y) || isNaN(z)) {
            throw  new Exception("Insert a number");}
            int a = getMax(x, y);
            if (a >= z) {
                return a;
            } else {
                return z;
            }

        }


    }
