package com.company;

//https://leetcode-cn.com/problems/k-th-smallest-prime-fraction/
public class 第K个最小的素数分数 {

    public static class KV {
        public KV(int k, int v, double value) {
            this.k = k;
            this.v = v;
            this.value = value;
        }

        int k;
        int v;
        double value;
    }

    /* public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
         List<KV> list = new ArrayList<>();
         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 list.add(new KV(arr[i], arr[j], (double) arr[i] / (double) arr[j]));
             }
         }
         list.sort(Comparator.comparingDouble(x -> x.value));
         int[] b = {list.get(k - 1).k, list.get(k - 1).v};
         return b;
     }*/

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double l = 0;
        double r = 1;
        while (l < r) {
            double mid = (l + r) / 2;
            int[] num = find(arr, mid);
            if (num[2] == k) {
                return new int[]{num[0], num[1]};
            } else if (num[2] > k) {
                r = mid;
            } else {
                l = mid;
            }
            //System.out.println(mid);
            //System.out.println(num[2]);
        }
        return new int[0];
    }

    static int[] find(int[] arr, double x) {
        int i = -1;
        int cnt = 0;
        int a = arr[0];
        int b = arr[arr.length - 1];
        for (int j = 1; j < arr.length; j++) {
            while (i < j - 1 && arr[i + 1] < x * arr[j]) {
                i++;
            }
            cnt += i + 1;
            if (i >= 0 && arr[i] * b > arr[j] * a) {
                a = arr[i];
                b = arr[j];
            }
        }
        return new int[]{a, b, cnt};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        kthSmallestPrimeFraction(a, 3);
    }

}
