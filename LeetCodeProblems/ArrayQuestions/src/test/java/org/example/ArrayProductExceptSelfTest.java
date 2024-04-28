package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class ArrayProductExceptSelfTest extends TestCase {

    @Test
    public void testProduct(){
        ArrayProductExceptSelf o = new ArrayProductExceptSelf();
        int[] arr = new int[]{1,2,3,4};
        int[] result = o.productExceptSelf(arr);
        assertEquals(Arrays.equals(result, new int[]{24,12,8,6}),true);
    }

}
