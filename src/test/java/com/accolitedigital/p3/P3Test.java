package com.accolitedigital.p3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P3Test {


    //DO NOT change the expected value
    private final int expected = 6;

    P3 p3 = new P3();

    // HINT - fix the test, not the class P3
    @Test
    void t3() throws IOException {
        var output = p3.readFile(); // HINT - see what is there is output and think how you can extract expected from it.
        Assertions.assertEquals(expected, output);
    }

}