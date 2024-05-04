package org.example;

public class ReversingNumber {

    /*
    https://leetcode.com/problems/reverse-bits/description/

    Reverse bits of a given 32 bits unsigned integer.
Note:
Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.

Example 1:
Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.

Example 2:
Input: n = 11111111111111111111111111111101
Output:   3221225471 (10111111111111111111111111111111)
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.

Constraints:
The input must be a binary string of length 32
     */

    public int reverseNum(int n){
        // The >>> operator in Java is the unsigned right shift operator.
        // It shifts the bits of a number to the right by a specified number of positions, and zero fill the leftmost bits with zeros.

        //System.out.println(Integer.toBinaryString(n));
        n = ((n & 0b11111111111111110000000000000000) >>> 16) | ((n & 0b00000000000000001111111111111111) << 16) ;
        //System.out.println(Integer.toBinaryString(n));
        n = ((n & 0b11111111000000001111111100000000) >>> 8) | ((n & 0b00000000111111110000000011111111) << 8) ;
        //System.out.println(Integer.toBinaryString(n));
        n = ((n & 0b11110000111100001111000011110000) >>> 4) | ((n & 0b00001111000011110000111100001111) << 4) ;
        //System.out.println(Integer.toBinaryString(n));
        n = ((n & 0b11001100110011001100110011001100) >>> 2) | ((n & 0b00110011001100110011001100110011) << 2);
        //System.out.println(Integer.toBinaryString(n));
        n = ((n & 0b10101010101010101010101010101010) >>> 1) | ((n & 0b01010101010101010101010101010101) << 1) ;
        //System.out.println(Integer.toBinaryString(n));
        
       /* n = ((n & 0xffff0000) >>> 16) | ((n & 0x0000ffff) << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);*/

        return n;
    }
}
