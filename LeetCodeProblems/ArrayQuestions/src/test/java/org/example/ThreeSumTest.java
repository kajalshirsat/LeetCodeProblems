package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSumTest extends TestCase {

    public void testThreeSum(){
        ThreeSum o = new ThreeSum();
        ArrayList<List<Integer>> res ;
        ArrayList<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,0,1));
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        res = (ArrayList<List<Integer>>) o.threeSum(arr);
        assertEquals(expected,res);
    }
}
