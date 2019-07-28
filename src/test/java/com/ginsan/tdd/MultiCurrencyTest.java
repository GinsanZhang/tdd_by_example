package com.ginsan.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    // 当瑞士法郎和美元当汇率为2：1时，5美元+10法郎=10美元
    //  5美元*2=10美元 --done
    //  amount 定义为私有
    // Dollar 类有副作用？
    // todo 钱必须是 int？
    // 实现equals()
    // 实现 hashCode()
    // todo 和空对象判等
    // todo 和非同类对象判等
    // 5法郎*2=10法郎
    //   消除美元和法郎之间等重复设计
    //  普遍判等
    // todo 普通相乘
    // 比较美元和法郎对象
    // 货币？
    // 删除法郎等乘法测试？消除times重复
    // Bank.reduce(Money)
    // todo reduce(Bank,String)
    // todo 带换算等 reduce money
    // todo 利率是小数

    @Test
    public void should_support_multiplication() {
        // given
        Money five = Money.dollar(5);
        // when
        // then
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }


    @Test
    public void should_be_equal() {
        // given
        // when
        // then
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(Money.franc(5)).isEqualTo(Money.franc(5));
        assertThat(Money.franc(5)).isNotEqualTo(Money.franc(6));
        assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));

    }

    @Test
    public void should_test_currency() {
        // given
        // when
        // then
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
        assertThat("CHF").isEqualTo(Money.franc(1).currency());
    }

    @Test
    public void should_be_do_correct_with_addition() {
        // given
        Money five = Money.dollar(5);
        // when
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        // then
        assertThat(Money.dollar(10)).isEqualTo(reduced);
    }

    @Test
    public void should_return_sum_when_plus() {
        // given
        Money five = Money.dollar(5);
        // when
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        // then
        assertThat(five).isEqualTo(sum.augend);
        assertThat(five).isEqualTo(sum.addend);
    }

    @Test
    public void should_reduce_sum() {
        // given
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        // when
        Money result = bank.reduce(sum, "USD");
        // then
        assertThat(Money.dollar(7)).isEqualTo(result);
    }

    @Test
    public void should_reduce_money() {
        // given
        Bank bank = new Bank();
        // when
        Money money = bank.reduce(Money.dollar(1), "USD");
        // then
        assertThat(Money.dollar(1)).isEqualTo(money);
    }

    @Test
    public void should_reduce_money_with_different_currency() {
        // given
        Bank bank = new Bank();
        bank.addRate(new Pair("CHF","USD"),2);
        // when
        Money result = bank.reduce(Money.franc(2), "USD");
        // then
        assertThat(Money.dollar(1)).isEqualTo(result);
    }
}
