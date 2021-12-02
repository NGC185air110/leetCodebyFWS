package com.company;

import java.util.*;

public class 相对名次 {
    /*public static String[] findRelativeRanks(int[] score) {
        Map<Integer, String> HM = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int it : score) {
            queue.add(it);
        }
        String[] newH = new String[score.length];
        int i = 0;
        while (!queue.isEmpty()) {
            if (i < score.length - 3) {
                HM.put(queue.peek(), (score.length - i) + "");
            } else if (i == score.length - 3) {
                HM.put(queue.peek(), "Bronze Medal");
            } else if (i == score.length - 2) {
                HM.put(queue.peek(), "Silver Medal");
            } else if (i == score.length - 1) {
                HM.put(queue.peek(), "Gold Medal");
            }
            queue.poll();
            i++;
        }
        for (int j = 0; j < score.length; j++) {
            newH[j] = HM.get(score[j]);
        }
        return newH;
    }*/
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; ++i) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for (int i = 0; i < n; ++i) {
            if (i >= 3) {
                ans[arr[i][1]] = Integer.toString(i + 1);
            } else {
                ans[arr[i][1]] = desc[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        findRelativeRanks(score);
    }
}
