package org.example;

import junit.framework.TestCase;

import java.util.Arrays;

public class CountingBitsTest extends TestCase{

    public void testCountingBits(){
        CountingBits c = new CountingBits();
        int[] ans = c.countBits(9);
        assertTrue(Arrays.equals(new int[]{0,1,1,2,1,2,2,3,1,2}, ans));
    }
}
