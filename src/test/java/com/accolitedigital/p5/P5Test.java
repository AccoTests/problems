package com.accolitedigital.p5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P5Test {

    //DO NOT change the expected value
    private final int expected=2;

    P5 p5=new P5();

    // HINT - fix test, not the class
    @Test
    void t5(){
        int i = p5.counterAdd();
        Assertions.assertEquals(expected, i);
    }
}