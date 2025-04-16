package com.company;

public class 在排序数组中查找元素的第一个和最后一个位置 {

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int index = seek(nums, target);
        if (index > -1) {
            //我找到了这个数字那我开两个指针同时向左向右找最后找到的那个数

            //边界情况
            int goLeft = index - 1;
            int goRight = index + 1;
            while (goLeft >= 0 && nums[goLeft] == target) {
                goLeft--;
            }
            while (goRight < nums.length && nums[goRight] == target) {
                goRight++;
            }
            System.out.println("二分查找------" + (goLeft + 1) + "------- " + (goRight - 1) + "");
            return new int[]{(goLeft + 1), (goRight - 1)};
        } else {
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 7, 7, 8, 8, 10};
        int[] b = {2, 2, 5, 67, 99, 99, 99, 100};
        searchRange(b, 99);
    }

    static int seek(int[] nums, int target) {
        int left = 0;//初始指针
        int right = nums.length - 1;//最大位置
        int middle = (right - left) / 2;//中间值
        while (left <= right) {
            if (nums[middle] == target) {
                return middle;//找到了下标
            } else if (nums[middle] > target) {//那就该往左走
                right = middle - 1;
                middle = (right - left) / 2;//重新算
            } else if (nums[middle] < target) {
                left = middle + 1;
                middle = ((right - left) / 2) + left;//向右位移
            }
        }
        return -1;
    }
}
