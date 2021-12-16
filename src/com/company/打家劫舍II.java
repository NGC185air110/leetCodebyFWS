package com.company;

public class 打家劫舍II {
    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = Math.max(dp[1], nums[1]);
        for (int i = 3; i <= nums.length - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }

        int[] dp1 = new int[nums.length + 1];
        dp1[0] = 0;
        dp1[1] = nums[1];
        dp1[2] = Math.max(dp1[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }
        return Math.max(dp[nums.length - 1], dp1[nums.length - 1]);
    }

    public static void main(String[] args) {
        rob(new int[]{1,3,1,3,100});
    }
}
