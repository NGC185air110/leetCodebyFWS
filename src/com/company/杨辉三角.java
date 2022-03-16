package com.company;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> b = new ArrayList<>();
        a.add(1);
        b.add(a);
        if (numRows == 1) return b;
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(1);
        b.add(c);
        if (numRows == 2) return b;

        List<Integer> item = new ArrayList<>();
        for (int i = 3; i <= numRows; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || (j + 1) == i) {
                    item.add(1);
                } else {
                    item.add(b.get(i - 2).get(j - 1) + b.get(i - 2).get(j));
                }
            }
            b.add(item);
            item = new ArrayList<>();
        }
        return b;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> b = new ArrayList<>();
        a.add(1);
        b.add(a);
        if (rowIndex == 1) return b.get(rowIndex);
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(1);
        b.add(c);
        if (rowIndex == 2) return b.get(rowIndex);

        List<Integer> item = new ArrayList<>();
        for (int i = 3; i <= rowIndex; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || (j + 1) == i) {
                    item.add(1);
                } else {
                    item.add(b.get(i - 2).get(j - 1) + b.get(i - 2).get(j));
                }
            }
            b.add(item);
            item = new ArrayList<>();
        }
        return b.get(rowIndex);
    }
}
