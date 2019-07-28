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
    // todo 5法郎*2=10法郎

    @Test
    public void should_support_multiplication() {
        // given
        Dollar five = new Dollar(5);
        // when
        // then
        assertThat(five.times(2)).isEqualTo(new Dollar(10));
        assertThat(five.times(3)).isEqualTo(new Dollar(15));
    }
}
