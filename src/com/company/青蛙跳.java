package com.company;

public class 青蛙跳 {
    public static int jumpKing(int i) {
        if (i <= 1) {
            return i;
        }
        int[] dp = new int[i + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int j = 3; j <= i; j++) {
            dp[j] = dp[j - 1] + dp[j - 2];
        }
        return dp[i];
    }

    public static void main(String[] args) {
        jumpKing(10);
    }
}
