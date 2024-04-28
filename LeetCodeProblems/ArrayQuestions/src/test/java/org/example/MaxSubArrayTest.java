package org.example;

import junit.framework.TestCase;

public class MaxSubArrayTest  extends TestCase {

    public void testMaxProdSubArray(){
        MaxProdSubArray o = new MaxProdSubArray();
        int[] arr = new int[]{2,3,-2,4};
        int result = o.maxProduct(arr);
        assertEquals(result,6);
    }
}
