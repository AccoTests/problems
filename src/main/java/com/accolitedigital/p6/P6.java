package com.accolitedigital.p6;

public class P6 {

    public Double s(Scale scale){
        return scale.getValue()/2.54;
    }
}


enum Scale {
    A(10),
    B(20),
    C(30);

    private final int value;

    Scale(int i) {
        this.value=i;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Scale{" +
                "value=" + value +
                '}';
    }
}