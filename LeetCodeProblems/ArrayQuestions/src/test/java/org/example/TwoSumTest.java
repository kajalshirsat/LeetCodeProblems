package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest extends TestCase {

    @Test
    public void testTwoSum(){
        TwoSum t = new TwoSum();
        int[] arr = new int[]{2,7,11,15};
        int[] result = t.twoSum(arr,9);
        assertEquals(Arrays.equals(result,new int[]{0,1}),true);
    }
}
