package org.example;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int set_bits = 0;
        while(n>0){
            if((n&1) == 1){
                set_bits++;
            }
            n = n >> 1;
        }
        return set_bits;

    }
}
