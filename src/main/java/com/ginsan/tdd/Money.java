package com.ginsan.tdd;

import java.util.Objects;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public Money(int amount) {
        this.amount = amount;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
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
