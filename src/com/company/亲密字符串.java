package com.company;

import java.util.HashMap;

public class 亲密字符串 {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
        /*if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            char[] chars = s.toCharArray();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (char c : chars) {
                if (!hm.containsKey(c)) {
                    hm.put(c, 1);
                } else {
                    hm.put(c, hm.get(c) + 1);
                }
            }
            for (Character key : hm.keySet()) {
                if (hm.get(key) >= 2) {
                    return true;
                }
            }
            return false;
        }

        int i = 0;
        int j = 1;
        StringBuilder newS = new StringBuilder();
        while (i < s.length() - 1) {
            if (s.charAt(i) != goal.charAt(i)) {
                j = i + 1;
                break;
            }
            i++;
        }
        while (j < goal.length() - 1) {
            if (s.charAt(j) != goal.charAt(j)) {
                break;
            }
            j++;
        }
        for (int z = 0; z < s.length(); z++) {
            if (z == i) {
                newS.append(s.charAt(j));
            } else if (z == j) {
                newS.append(s.charAt(i));
            } else {
                newS.append(s.charAt(z));
            }
        }
        return newS.toString().equals(goal);*/
    }

    public static void main(String[] args) {
        buddyStrings("bbbbbbbbbbdf", "bbbbbbbbbbdf");
    }
}
