package com.company;

import java.util.PriorityQueue;

public class 最小的k个数 {
    public static void main(String[] args) {

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        for (int a : arr) {
            num.offer(a);
        }
        int[] newH = new int[k];
        for (int i = 0; i < k; i++) {
            newH[i] = num.poll();
        }
        return newH;
    }
}
