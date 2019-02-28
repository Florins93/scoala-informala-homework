package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreesTest {

    private Degrees d = new Degrees();
    @Test
    void toCelsius() throws Exception {
        Assertions.assertEquals(10, d.toCelsius(50));
    }

    @Test
    void toCelsiusExc(){
        assertThrows(Exception.class,()->d.toCelsius(Float.NaN));
    }
}