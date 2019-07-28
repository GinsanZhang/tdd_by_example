package com.ginsan.tdd;

import java.util.Objects;

public  class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount,"CHF");
    }

    public  Money times(int multiplier){
        return  new Money(amount*multiplier,currency);
    };

    public String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
