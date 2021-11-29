package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class 有效的括号 {
    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size() == 0 || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isValid("(){}}{");
    }
}
