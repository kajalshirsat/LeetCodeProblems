package org.example;

import junit.framework.TestCase;

public class MissingNumTest extends TestCase {


    public void testMissingNum() {
        int[] a = new int[]{0,1,4,3,5};
        assertEquals(2,new MissingNumber().missingNum(a));
        assertEquals(2,new MissingNumber().missingNum2(a));
        assertEquals(2,new MissingNumber().missingNum3(a));
    }

}
