package com.company;

public class 快速排序 {
    public static void main(String[] args) {
        int[] a = {123, 10, 9, 5, 0, 234, 6, 32, 78, 9, 9, 0, 23, 1};
        quickSort(a, 0, a.length - 1);
        System.out.println(a[0]);
    }

    static void quicklySort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = a[left];
        int i = left;
        int j = right;
        while (left < right) {
            while (a[right] >= temp && left < right) {
                right--;
            }
            while (a[left] <= temp && left < right) {
                left++;
            }
            int s = a[right];
            if (right != left) {
                a[right] = a[left];
                a[left] = s;
            } else {
                a[right] = a[i];
                a[i] = s;
                quicklySort(a, i, right);
                quicklySort(a, right + 1, j);
            }
        }
    }


    static void quickSort(int[] a, int star, int end) {
        int dart = a[star];
        int i = star;
        int j = end;
        while (star < end) {
            while (a[end] >= dart && star < end) {//末尾找小
                end--;
            }
            while (a[star] <= dart && star < end) {//开头找大
                star++;
            }
            int tag = a[end];
            if (end != star) {
                a[end] = a[star];
                a[star] = tag;
            } else {
                a[i] = a[end];
                a[end] = dart;
                quickSort(a, i, end);
                quickSort(a, end + 1, j);
            }
        }
    }


}
