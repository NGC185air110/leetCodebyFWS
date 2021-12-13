package com.company;

public class 青蛙跳台阶问题 {
    public int numWays(int n) {
        if (n == 0) return 1;
        int[] dp = new int[n + 2];//dp[i]是第N次青蛙跳的跳法数
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n] % 1000000007;
    }

    public static void main(String[] args) {

    }
}
