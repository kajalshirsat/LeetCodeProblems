package org.example;

import java.util.*;

public class ThreeSum {

    /*

    Not Passed

https://leetcode.com/problems/3sum/description/

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
     */


    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        HashSet<List<Integer>> h2 = new HashSet<List<Integer>>();
        HashSet<List<Integer>> res = new HashSet<List<Integer>>();

        for(int i = 0; i<nums.length; i++){
            Iterator<List<Integer>> itr2=h2.iterator();
            while(itr2.hasNext())
            {
                List<Integer> tmp = itr2.next();
                //tmp = h2[j];
                int sum = tmp.get(0) + tmp.get(1) + nums[i];
                if(sum == 0){
                    List<Integer> tmp2;
                    if(tmp.get(0) > nums[i] )
                    {
                        tmp2 = Arrays.asList(nums[i],tmp.get(0),tmp.get(1));
                    }
                    else if (tmp.get(1) < nums[i] ){
                        tmp2 = Arrays.asList(tmp.get(0),tmp.get(1),nums[i]);
                    }
                    else{
                        tmp2 = Arrays.asList(tmp.get(0),nums[i],tmp.get(1));
                    }

                    res.add(tmp2);
                }
            }

            Iterator<Integer> itr=h1.iterator();
            while(itr.hasNext()){
                int k = itr.next();
                List<Integer> tmp3 = Arrays.asList(Math.min(k,nums[i]),Math.max(k,nums[i]));
                h2.add(tmp3);
            }



            h1.add(nums[i]);

        }

        return new ArrayList<List<Integer>>(res) ;
    }

}
