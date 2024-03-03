package com.accolitedigital.p2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2Test {

    //DO NOT change the expected value
    private final static double expected=0.5;


    private final I2 i2 = new P2();

    @Test
    void t2() {
        Double div = i2.div(1, 2);
        Assertions.assertEquals(expected, div);
    }

}