package com.sci.bv;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class maxiTest {

    private maxi m = new maxi();

    @org.junit.jupiter.api.Test
    public void getMax() {
        int a = 5;
        int b = 6;

        int res = m.getMax(a, b);

        Assertions.assertEquals(10, res);
    }


    @org.junit.jupiter.api.Test
    public void getMaxEquals() {
        Assertions.assertEquals(4, m.getMax(4, 4));
    }



    @org.junit.jupiter.api.Test
    void getMax2() {
        int a = 5;
        int b = 6;
        int c = 10;

        int res = m.getMax2(a, b, c);

        Assertions.assertEquals(11, res);
    }

    @org.junit.jupiter.api.Test
    public void getMax2Equals() {
        Assertions.assertEquals(4, m.getMax2(4, 4,5));
    }

}