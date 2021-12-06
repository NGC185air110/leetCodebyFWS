package com.company;

//https://leetcode-cn.com/problems/powx-n/  372的前置知识点
public class Powxn {

    public static double myPow(double x, int n) {
        Long mi = Long.valueOf(n);
        Long mi1 = mi;
        if (n == 0 || x == 1) {
            return 1;
        }else if (n < 0) {
            mi1 = -mi1;
        }
        double r = 1;
        while (mi1 != 0) {
            if (mi1 % 2 == 1) {
                r = r * x;
            }
            x = x * x;
            mi1 = mi1 >> 2;
        }
        if (mi < 0) {
            return 1 / r;
        }
        return r;

    }




    public static void main(String[] args) {
        myPow(2, -2147483648);
    }
}
