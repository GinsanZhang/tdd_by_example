package com.ginsan.tdd;

import java.util.Objects;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
