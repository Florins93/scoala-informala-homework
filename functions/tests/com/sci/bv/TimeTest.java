package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    private Time t = new Time();
    @org.junit.jupiter.api.Test
    void hourAndMinutes() {

        int hour = 25;
        int minutes = 15;

        assertThrows(IllegalArgumentException.class,()->t.hourAndMinutes(hour,minutes));

        }

    @Test
    void hourAndMinutesTrue(){

        Assertions.assertEquals(22+": "+33, t.hourAndMinutes(22,33));
    }


    }
