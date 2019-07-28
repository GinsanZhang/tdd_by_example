package com.ginsan.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTest {

    @Test
    public void should_get_ont_when_is_same_currency() {
        // given
        // when
        // then
        assertThat(1).isEqualTo(new Bank().rate("USD", "USD"));
    }
}