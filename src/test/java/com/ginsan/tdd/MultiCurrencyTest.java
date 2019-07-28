package com.ginsan.tdd;

import org.junit.Test;
import  static  org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    // 当瑞士法郎和美元当汇率为2：1时，5美元+10法郎=10美元
    // todo 5美元*2=10美元

    @Test
    public void should_support_multiplication() {
        // given
        Dollar five = new Dollar(5);
        // when
        five.times(2);
        // then
        assertThat(five.amount).isEqualTo(10);
    }
}
