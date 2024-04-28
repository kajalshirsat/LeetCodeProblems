package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class FindMinInRotatedArrayTest extends TestCase {

    @Test
    public void testMin(){
        FindMinInRotatedArray o = new FindMinInRotatedArray();
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int result = o.findMin(arr);
        assertEquals(result,0);
    }

}
