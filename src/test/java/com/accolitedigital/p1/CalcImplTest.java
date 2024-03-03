package com.accolitedigital.p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcImplTest {

    //DO NOT change the expected value
    private final static int expected=3;

    Calc calc;

    @Test
    void calcTest(){
        int add = calc.add(1, 2);
        Assertions.assertEquals(expected, add);
    }

}