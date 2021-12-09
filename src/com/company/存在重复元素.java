package com.company;

public class 存在重复元素 {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("i=="+nums[i]);
                System.out.println("j=="+nums[j]);
                if (nums[i] > nums[j]) {
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate(new int[]{1, 4, 3, 2, 50, 60, 1});
    }
}
