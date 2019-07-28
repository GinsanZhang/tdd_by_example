package com.ginsan.tdd;

public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount,"USD");
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
