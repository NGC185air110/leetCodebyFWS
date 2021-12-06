package com.company;

//非常简单有手就行
public class 截断句子 {
    public static String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && --k == 0) {
                return s.substring(0, i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        truncateSentence("Hello how are you Contestant", 4);
    }
}
