package org.example;

import java.util.HashMap;

public class TwoSum {

    //Improve Time Complexity

    //https://leetcode.com/problems/two-sum/
    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numIndexMap = new HashMap<>(); // HashMap to store num:index pairs
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numIndexMap.containsKey(complement)) {
                    return new int[]{numIndexMap.get(complement), i}; // Found the pair
                }
                numIndexMap.put(nums[i], i); // Storing the current num:index pair
            }
            return new int[0]; // No such pair found
        }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

}
