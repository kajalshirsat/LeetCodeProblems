package org.example;

public class MaxProdSubArray {

    /*

https://leetcode.com/problems/maximum-product-subarray/description/

Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

     */


    public int maxProduct(int[] nums) {

        int max = nums[0];
        int prod = 1;
        int neg = 0;

        for (int i = 0; i< nums.length; i++)
        {
            prod = prod * nums[i];

            max = Math.max(max, prod);

            if(prod==0){
                prod = 1;
                neg = 0;
            }
            else if (prod < 0){
                if(neg == 0)
                    neg = prod;
                else
                    max = Math.max(max, prod/neg);
            }
        }
        return max;
    }

}
