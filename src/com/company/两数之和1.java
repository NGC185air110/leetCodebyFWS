package com.company;

public class 两数之和1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i]+nums[j]==target){
                    return new int[]{j,i};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 18);
    }
}
