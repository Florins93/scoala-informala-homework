package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time t = new Time();
    @Test
    public void hourAndMinutes() {
        Assertions.assertEquals(" The time is "+ 22 +": "+33+" now.", t.hourAndMinutes(22,33));
    }
}