package org.example;

public class MaxSubArray {

    /*

https://leetcode.com/problems/maximum-subarray/description/

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104

     */

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = Math.max(0,nums[0]);


        // The idea is to maintain two variable, max will compare max and sum and store max value
        //sum will contain sum so far, sum will be either pos or zero, sum will be updated after max

        for(int i=1; i< nums.length; i++)
        {
            sum = sum + nums[i];
            max = Math.max(max,sum);
            if (sum < 0 )
            {
                sum = 0;
            }

        }
        return max;

    }

}
