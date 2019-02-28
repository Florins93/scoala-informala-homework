//create a programm who display how many degrees has a human body
package com.sci.bv;

import static java.lang.Float.isNaN;

public class Degrees {

    //crate a method who transform fahrenheit degrees in celsius degrees
    public static float toCelsius(float degrees)throws Exception{

        if( isNaN(degrees)){
            throw  new Exception("Insert a number");
        }
        float y = (degrees-32)*5/9;
        return y;
    }




}
