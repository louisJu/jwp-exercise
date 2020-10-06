package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator sc;

    @Before
    public void setup(){
        sc = new StringCalculator();
    }

    @Test
    public void add_isnull_or_isempty() {
        assertEquals(0, sc.add(""));
    }

    @Test
    public void return_number() {
        assertEquals(1, sc.add("1"));
    }

    @Test
    public void add_number(){
        assertEquals(3, sc.add("1,2"));
    }

    @Test
    public void add_multi_number(){
        assertEquals(6, sc.add("1,2:3"));
    }

    @Test
    public void custom_delimeter_number(){
        assertEquals(6, sc.add("//[\n1[2:3"));
    }

    @Test(expected = RuntimeException.class)
    public void minus_number(){
        sc.add("-4");
    }


}