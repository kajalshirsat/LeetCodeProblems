package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class MaxProdSubArrayTest extends TestCase {

    @Test
    public void testMaxProd(){
        MaxProdSubArray o = new MaxProdSubArray();
        int[] arr = new int[]{2,3,-2,4};
        int r = o.maxProduct(arr);
        assertEquals(r,6);
    }

}
