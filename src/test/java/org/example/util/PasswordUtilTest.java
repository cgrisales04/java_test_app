package org.example.util;

import org.junit.Test;

import static org.example.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.accessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.accessPassword("abcdefghijk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.accessPassword("abcdefghijk123"));
    }

    @Test
    public void strong_when_has_letter_numbers_and_symbols(){
        assertEquals(STRONG, PasswordUtil.accessPassword("abcdf123.*"));
    }


}