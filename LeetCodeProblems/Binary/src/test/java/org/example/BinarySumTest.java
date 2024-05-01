package org.example;

import junit.framework.TestCase;
import org.junit.Test;
public class BinarySumTest extends TestCase {


    @Test
    public void testBinarySum(){
        int a = 2, b = 4;
        BinarySum bs = new BinarySum();
        int c = bs.getSum(a,b);
        assertEquals(6,c);
    }

    @Test
    public void testBinarySum2(){
        int a = -2, b = 8;
        BinarySum bs2 = new BinarySum();
        int c = bs2.getSum(a,b);
        assertEquals(6,c);
    }

}
