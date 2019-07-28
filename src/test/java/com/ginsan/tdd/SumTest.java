package com.ginsan.tdd;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class SumTest {

    @Test
    public void should_plus() {
        // given
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        // when
        Expression sum = new Sum(fiveBucks,tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        // then
        assertThat(Money.dollar(15)).isEqualTo(result);
    }

    @Test
    public void should_times() {
        // given
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        // when
        Expression sum = new Sum(fiveBucks,tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        // then
        assertThat(Money.dollar(20)).isEqualTo(result);
    }
}