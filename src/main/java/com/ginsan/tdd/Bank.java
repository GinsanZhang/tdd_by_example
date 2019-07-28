package com.ginsan.tdd;

public class Bank {
    public Money reduce(Expression source, String to) {
        // todo: force cast
        // todo : train
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}
