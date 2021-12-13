package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 两个数组的交集II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> newL = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (nums1[a] > nums2[b]) {
                b++;
            } else if (nums1[a] == nums2[b]) {
                newL.add(nums1[a]);
                a++;
                b++;
            } else if (nums1[a] < nums2[b]) {
                a++;
            }
            if (a >= nums1.length) {
                break;
            }
            if (b >= nums2.length) {
                break;
            }
        }
        int[] newH = new int[newL.size()];
        for (int i = 0; i < newL.size(); i++) {
            newH[i] = newL.get(i);
        }
        return newH;

    }

    public static void main(String[] args) {
        intersect(new int[]{1}, new int[]{1});
    }
}
