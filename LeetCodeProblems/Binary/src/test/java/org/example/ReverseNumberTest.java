package org.example;

import junit.framework.TestCase;

public class ReverseNumberTest extends TestCase {

    public void testReverseNum(){
        assertEquals(964176192,new ReversingNumber().reverseNum(43261596));
        assertEquals(-1073741825,new ReversingNumber().reverseNum(-3));
    }
}
