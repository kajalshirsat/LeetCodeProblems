package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class ContainerWithMostWaterTest extends TestCase{

    @Test
    public void testWater(){
        ContainerWithMostWater o = new ContainerWithMostWater();
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int result = o.maxArea(arr);
        assertEquals(49, result);
    }

}
