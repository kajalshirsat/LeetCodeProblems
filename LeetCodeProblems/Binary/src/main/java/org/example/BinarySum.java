package org.example;



public class BinarySum {


    //https://leetcode.com/problems/sum-of-two-integers/description/

    /*
Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example 1:
Input: a = 1, b = 2
Output: 3

Example 2:
Input: a = 2, b = 3
Output: 5

Constraints:
-1000 <= a, b <= 1000
     */

    public static int getSum(int p, int q)
    {
        int result = p ^ q; // + without carry 0+0=0, 0+1=1+0=1, 1+1=0
        int carry = (p & q) << 1; // 1+1=2
        if (carry != 0) {
            return getSum(result, carry);
        }
        return result;
    }

}
