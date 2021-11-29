package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static class Value {
        int num1;
        int num2;
    }


    public static void main(String[] args) {


        // write your code here
        Value value = new Value();
        value.num1 = 10;
        value.num2 = 20;
        System.out.println("***********交换前***********");
        System.out.println("num1 = " + value.num1 + "," + "num2 = " + value.num2);
        System.out.println("****************************");
        System.out.println("***********交换后***********");
        swap(value);
        System.out.println("========main========");
        System.out.println("num1 = " + value.num1 + "," + "num2 = " + value.num2);
        System.out.println("====================");
        System.out.println("****************************");

        String a = "1";
        String b = "2";
        List arrayList = new ArrayList<String>();
        arrayList.add(a);
        arrayList.add(b);
        System.out.println("a = " + arrayList.get(0) + "," + "b = " + arrayList.get(1));
        aTob(arrayList);
        System.out.println("========main========");
        System.out.println("a = " + arrayList.get(0) + "," + "b = " + arrayList.get(1));
    }

    static void swap(Value value) {
        Value newValue = value;
        int temp = newValue.num1;
        newValue.num1 = newValue.num2;
        newValue.num2 = temp;
        System.out.println("========swap========");
        System.out.println("num1 = " + newValue.num1 + "," + "num2 = " + newValue.num2);
        System.out.println("====================");
    }

    static void aTob(List<String> a) {
        String c = a.get(0);
        a.set(0, a.get(1));
        a.set(1, c);
        System.out.println("========aTob========");
        System.out.println("a = " + a.get(0) + "," + "b = " + a.get(1));
    }
}
