package org.example.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeatStringOne() {
        Assert.assertEquals("HolaHola", StringUtil.repeat("Hola", 2));
    }

    @Test
    public void testRepeatStringZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes() {
        StringUtil.repeat("Hola", -2);
    }
}