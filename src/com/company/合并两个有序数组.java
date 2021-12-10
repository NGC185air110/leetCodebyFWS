package com.company;

public class 合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = new int[nums1.length];
        System.arraycopy(nums1, 0, a, 0, a.length);
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (x < m && y < n) {
                if (a[x] < nums2[y]) {
                    nums1[i] = a[x];
                    x++;
                } else {
                    nums1[i] = nums2[y];
                    y++;
                }
                continue;
            }

            if (y >= n && x < m) {
                nums1[i] = a[x];
                x++;
                continue;
            }

            if (x >= m && y < n) {
                nums1[i] = nums2[y];
                y++;
                continue;
            }
        }
        System.out.println(nums1);
    }

    public static void main(String[] args) {
        merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }
}
