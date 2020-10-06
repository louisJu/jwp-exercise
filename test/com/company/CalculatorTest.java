package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() {
        assertEquals(9, cal.add(6,3));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(3,cal.subtract(6,3));
        System.out.println("subtract");
    }

    @Test
    public void multiply() {
        assertEquals(18, cal.multiply(6,3));
        System.out.println("multi");
    }

    @Test
    public void divide() {
        assertEquals(2, cal.divide(6,3));
        System.out.println("didvide");
    }
    @After
    public void teardown(){
        System.out.println("teardown");
    }
}