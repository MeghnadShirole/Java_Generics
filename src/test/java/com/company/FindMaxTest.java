package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/*
 * These Test Cases will Test for FindMax class
 * To check Whether it is working Fine/Not and returning correct values
 * These Test Cases are providing 3 parameters to the method to find largest of 3 numbers
 */
public class FindMaxTest {
    FindMax findMax;

    @Before
    public void initData() {
        findMax = new FindMax();
    }

    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer max = findMax.findMaxValue(35, 110, 105);
        Assert.assertEquals((Integer) 110, max);
    }

    @Test
    public void givenThirdNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer max = findMax.findMaxValue(35, 110, 215);
        Assert.assertEquals((Integer) 215, max);
    }
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float max = findMax.findMaxValue(350f, 110f, 215f);
        Assert.assertEquals((Float) 350f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float max = findMax.findMaxValue(35f, 110f, 25f);
        Assert.assertEquals((Float) 110f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float max = findMax.findMaxValue(350f, 110f, 450f);
        Assert.assertEquals((Float) 450f, max);
    }
}