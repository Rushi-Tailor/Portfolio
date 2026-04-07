/*
*  LeetCode #1: Two Sum
*  Given an array of integers 'nums' and an integer 'target', return the
*  indices of the two numbers such that they add up to 'target'.
*  You may assume that each input would have exactly one solution and you
*  may not use the same element twice.
*/


import java.util.Arrays;

public class Solution {
    public static void main(String args[]){

        // Test Case #1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] test1 = twoSum(nums1, target1);

        System.out.println(Arrays.toString(test1));




    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2]; // array to store the indices

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
