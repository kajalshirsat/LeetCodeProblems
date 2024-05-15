package org.example;

import junit.framework.TestCase;

public class LongestSubstringWoRepititionTest extends TestCase {
    
    public void testFunction(){
        String s = "abcabcbb";
        assertEquals(3,new LongestSubstringWoRepetition().lengthOfLongestSubstring(s));
        assertEquals(3,new LongestSubstringWoRepetition().lengthOfLongestSubstring2(s));
        assertEquals(3,new LongestSubstringWoRepetition().lengthOfLongestSubstring3(s));
        assertEquals(3,new LongestSubstringWoRepetition().lengthOfLongestSubstring4(s));
    }

}
