package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxiTest {
    maxi m1 = new maxi();
    @Test
    void getMax() throws Exception {
        Assertions.assertEquals(3,m1.getMax(3,1));
    }
    @Test
    void getMaxx() throws Exception {
        Assertions.assertEquals(3,m1.getMax(1,3));
    }

    @Test
    void getMaxxx() throws Exception {
        Assertions.assertEquals(3,m1.getMax(3,3));
    }

    @Test
    void getMax2() throws Exception{
        Assertions.assertEquals(3,m1.getMax2(3,3,3));
    }

    @Test
    void getMaxx2() throws Exception{
        Assertions.assertEquals(3,m1.getMax2(3,2,1));
    }

    @Test
    void getMaxxx2() throws Exception{
        Assertions.assertEquals(3,m1.getMax2(0,-5,3));
    }



}