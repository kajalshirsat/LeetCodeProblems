package org.example;

import junit.framework.TestCase;

public class MaxSubArrayTest  extends TestCase {

    public void testMaxSubArray(){
        MaxSubArray o = new MaxSubArray();
        int[] arr = new int[]{5,4,-1,7,8};
        int result = o.maxSubArray(arr);
        assertEquals(result,23);
    }
}
