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
    // todo  消除美元和法郎之间等重复设计
    //  普遍判等
    // todo 普通相乘
    // 比较美元和法郎对象
    // todo 货币？

    @Test
    public void should_support_multiplication_for_dollar() {
        // given
        Money five = Money.dollar(5);
        // when
        // then
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void should_support_multiplication_for_franc() {
        // given
        Franc five = new Franc(5);
        // when
        // then
        assertThat(five.times(2)).isEqualTo(new Franc(10));
        assertThat(five.times(3)).isEqualTo(new Franc(15));
    }

    @Test
    public void should_be_equal() {
        // given
        // when
        // then
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(5)).isNotEqualTo(new Franc(6));
        assertThat(new Franc(5)).isNotEqualTo(Money.dollar(5));

    }
}
