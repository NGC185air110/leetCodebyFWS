package com.company;

public class 超级次方 {
    public static int superPow(int a, int[] b) {
        int numB = b[0];
        a = a % 1337;
        if (a == 0) {
            return 0;
        }
        for (int i = 1; i < b.length; i++) {
            numB = (numB * 10 + b[i]) % 1140;
            //numB*=10;
        }
        numB += 1140;
        int x = a;
        for (int j = 0; j < numB; j++) {
            x = x % 1337;
            x *= a;
        }
        x /= a;
        return x;
    }

    public static void main(String[] args) {
        superPow(2, new int[]{4, 3, 3, 8, 5, 2});
    }
}
