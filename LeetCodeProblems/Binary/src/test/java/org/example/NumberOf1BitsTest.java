package org.example;

import junit.framework.TestCase;

import java.util.Arrays;

public class NumberOf1BitsTest extends TestCase {

    public void testNumberOf1Bits(){
        NumberOf1Bits o = new NumberOf1Bits();
        int ans = o.hammingWeight(7);
        assertEquals(3,ans);
    }

}
