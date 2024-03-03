package com.accolitedigital.p6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class P6Test {

    P6 p6=new P6();

    //DO NOT change the expected value
    private final String expected="3.937";

    @Test
    void t6() {
        System.out.println();
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        final String numValue = df.format(p6.s(Scale.A));
        Assertions.assertEquals(expected, numValue);
    }
}