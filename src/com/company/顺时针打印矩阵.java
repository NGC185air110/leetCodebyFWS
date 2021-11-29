package com.company;

public class 顺时针打印矩阵 {


    public static int[] spiralOrder(int[][] matrix) {
        int[][] myH = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            myH[i] = new int[matrix.length];
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                myH[i][j] = matrix[i][j];
                System.out.print(myH[i][j]);
            }
        }
        System.out.println();
        return new int[]{1, 2, 3};
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        spiralOrder(a);
    }
}
