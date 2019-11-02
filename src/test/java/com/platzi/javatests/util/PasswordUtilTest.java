package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public  void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("123456"));
    }

    @Test
    public  void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("ab11!"));
    }

    @Test
    public  void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde1122fs"));
    }

    @Test
    public  void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcde1122!!fs"));
    }

}