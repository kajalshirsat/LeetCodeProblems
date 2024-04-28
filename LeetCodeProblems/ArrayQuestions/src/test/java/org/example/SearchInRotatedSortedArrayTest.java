package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest extends TestCase {

    @Test
    public void testMin(){
        SearchInRotatedSortedArray o = new SearchInRotatedSortedArray();
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int result = o.search(arr,0);
        assertEquals(result,4);
    }

    public void testMin2(){
        SearchInRotatedSortedArray o = new SearchInRotatedSortedArray();
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int result = o.search(arr,3);
        assertEquals(result,-1);
    }

}
