package com.company;

public class 赎金信 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] maga = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransom[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            maga[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < maga.length; i++) {
            if (maga[i] - ransom[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }
}
