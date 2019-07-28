package com.ginsan.tdd;

import org.junit.Test;
import  static  org.assertj.core.api.Assertions.assertThat;

public class DollarTest {
    @Test
    public void testSomeLibraryMethod() {
        Dollar classUnderTest = new Dollar();
        assertThat(classUnderTest.someLibraryMethod()).isEqualTo(true);
    }
}
