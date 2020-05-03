package com.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class calculatorTest {
private calculator ca ;
    @Before
    public void setUp() throws Exception {
        ca = new calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
            float a = 12;
            float b = -10;
            float expected_res = 2;
            try {
                float res = ca.add(a, b);
                Assert.assertEquals(expected_res, res, 0.0);
            }catch (IOException ex){
                ex.printStackTrace();
            }

    }

    @Test
    public void subtract() {
        float a = 10;
        float b = -10;
        float expected_res = 20;
        try {
            float res = ca.subtract(a, b);
            Assert.assertEquals(expected_res, res, 0.0);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void multiply() {
        float a = 10;
        float b = -10;
        float expected_res = -100;
        try {
            float res = ca.multiply(a, b);
            Assert.assertEquals(expected_res, res, 0.0);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void divide() {
        float a = 100;
        float b = -10;
        float expected_res = -10;
        try {
            float res = ca.divide(a, b);
            Assert.assertEquals(expected_res, res, 0.0);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void modulus() {
        float a = 23;
        float b = 4;
        float expected_res = 3;
        try {
            float res = ca.modulus(a, b);
            Assert.assertEquals(expected_res, res, 0.0);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void main() {
    }
}