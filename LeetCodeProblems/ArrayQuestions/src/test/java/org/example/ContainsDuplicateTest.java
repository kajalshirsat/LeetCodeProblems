package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class ContainsDuplicateTest extends TestCase {

    @Test
    public void testDuplicate(){
        ContainsDuplicate o = new ContainsDuplicate();
        int[] arr = new int[]{1,2,3,1};
        int[] arr2 = new int[]{1,2,3,4};
        assertEquals(o.containsDuplicate(arr),true);
        assertEquals(o.containsDuplicate(arr2),false);
    }

}
