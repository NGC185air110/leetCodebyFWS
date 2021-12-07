package com.company;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) return new int[]{0, 1};
        Map<Integer, Integer> newH = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (newH.get(target - nums[i]) != null && i > 0) {
                return new int[]{newH.get(target - nums[i]), i};
            }
            newH.put(nums[i], i);
        }
        return new int[]{0, 1};
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3};
        twoSum(array, 6);

    }
}
