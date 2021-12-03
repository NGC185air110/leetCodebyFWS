package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class K次取反后最大化的数组和 {

    //我的暴力双优先列队
    /*public static int largestSumAfterKNegations(int[] nums, int k) {
        Queue<Integer> negative = new PriorityQueue<>();
        Queue<Integer> positive = new PriorityQueue<>();
        //正负分离
        for (int it : nums) {
            if (it > 0) {
                positive.add(it);
            } else {
                negative.add(it);
            }
        }
        //按K次数组合
        for (int i = 0; i < k; i++) {
            //两个都大于0
            if (negative.size() > 0 && positive.size() > 0) {
                positive.add(-negative.poll());
                continue;
            }
            //负数列表小于零正数列表大于零
            if (negative.size() <= 0 && positive.size() > 0) {
                negative.add(-positive.poll());
                k = k % 2;
                continue;
            }
            //正数列表小于零负数大于零
            if (negative.size() > 0 && positive.size() <= 0) {
                positive.add(-negative.poll());
                continue;
            }
        }
        //相加
        int num = 0;
        while (!negative.isEmpty()) {
            num += negative.poll();
        }
        while (!positive.isEmpty()) {
            num += positive.poll();
        }
        return num;
    }*/

    public static int largestSumAfterKNegations(int[] nums, int k) {
        // 排序，把可能有的负数排到前面
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // 贪心：如果是负数，而k还有盈余，就把负数反过来
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        // 如果k没剩，那说明能转的负数都转正了，已经是最大和，返回sum
        // 如果k有剩，说明负数已经全部转正，所以如果k还剩偶数个就自己抵消掉，不用删减，如果k还剩奇数个就减掉2倍最小正数。
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }

    public static void main(String[] args) {
        int[] a = {-2, 9, 9, 8, 4};
        largestSumAfterKNegations(a, 5);
    }
}
