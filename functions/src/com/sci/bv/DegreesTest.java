package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreesTest {

    private Degrees d = new Degrees();
    @Test
    void toCelsius() {
        Assertions.assertEquals(10, d.toCelsius(50));
    }

    @Test
    void toCelsiusFalse() {
        Assertions.assertEquals(11, d.toCelsius(120));
    }

}