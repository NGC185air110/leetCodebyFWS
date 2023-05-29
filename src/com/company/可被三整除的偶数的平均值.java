package com.company;

public class 可被三整除的偶数的平均值 {

    public static int averageValue(int[] nums) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) continue;
            if (nums[i] % 3 == 0) {//被3整除
                sum = sum + nums[i];
                count++;
            }
        }
        if (count > 0) {
            return (int) Math.floor(sum / (double) count);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 10};
        System.out.println(averageValue(a));
    }
}
