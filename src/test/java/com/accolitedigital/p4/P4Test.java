package com.accolitedigital.p4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4Test {

    //DO NOT change the expected value
    private final String expected="Apple";

    P4 p4=new P4();

    @Test
    void t4(){
        p4.addToMap("A", "Apple");
        String value = p4.getFromMap("A");
        Assertions.assertEquals(expected, value);
    }

}