package com.accolitedigital.p7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P7Test {

    //DO NOT change the expected value
    private final int expected=2;

    P7 p7= new P7();

    @Test
    void add() {
        p7.incr();
        int incr = p7.incr();

        Assertions.assertEquals(expected, incr);
    }
}