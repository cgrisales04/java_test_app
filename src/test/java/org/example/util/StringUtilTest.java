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
    @Test
    public void testStringIsNotEmpty() {
        Assert.assertFalse(StringUtil.isEmpty("Not a empty"));
    }

    @Test
    public void testStringIsEmpty() {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void testStringIsNull() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void testStringHaveSpace() {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }
}