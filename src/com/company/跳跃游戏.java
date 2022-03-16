package com.company;

public class 跳跃游戏 {
    public static boolean canJump(int[] nums) {
        if (nums[0] == 0 && nums.length != 1) return false;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] >= i - j && dp[j] == true) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        //canJump(new int[]{2, 3, 1, 1, 4});
        //canJump(new int[]{3, 2, 1, 0, 4});
        canJump(new int[]{1, 0, 1, 0});
    }
}
