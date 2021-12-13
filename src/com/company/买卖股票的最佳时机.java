package com.company;

import java.util.Arrays;

public class 买卖股票的最佳时机 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        //1. 第一步先找dp数组是吧 dp[i]就等于最大利润  i就等于天数
        int[] dp = new int[prices.length + 1];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1] + (prices[i] - prices[i - 1]), 0);
        }
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
