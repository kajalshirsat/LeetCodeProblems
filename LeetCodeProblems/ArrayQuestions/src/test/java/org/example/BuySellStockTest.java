package org.example;

import junit.framework.TestCase;
import org.junit.Test;


public class BuySellStockTest extends TestCase{

        @Test
        public void testBuySell(){
            BuySellStock o = new BuySellStock();
            int[] arr = new int[]{2,7,11,15};
            int result = o.maxProfit(arr);
            assertEquals(result,13);
        }
    }


