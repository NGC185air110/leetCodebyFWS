package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class 连续字符 {

    /*public static int maxPower(String s) {
        Queue<Integer> a = new PriorityQueue<>();
        int i = 0;
        int j = 1;
        int num = 1;
        while (j < s.length()) {
            if (s.charAt(j) - s.charAt(i) == 0) {
                num++;
            } else {
                a.offer(num);
                num = 1;
            }
            i++;
            j++;
        }
        a.offer(num);
        int b= 0;
        while (!a.isEmpty()){
            b = a.poll();
        }
        return b;
    }*/

    public static int maxPower(String s) {
        int ans = 1, cnt = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++cnt;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        maxPower("a");
    }
}
