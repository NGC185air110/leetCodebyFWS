package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class K个一组翻转链表 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        List<Integer> num = new ArrayList<>();
        List<Integer> numLow = new ArrayList<>();//尾
        List<Stack<Integer>> newH = new ArrayList<>();
        Stack<Integer> nodeS = new Stack<>();
        while (head != null) {
            num.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < num.size(); i++) {
            if (i + 1 == 1) {
                nodeS.push(num.get(i));
            } else if ((i + 1) % k == 0) {
                nodeS.push(num.get(i));
                newH.add(nodeS);
                nodeS = new Stack<>();
            } else {
                nodeS.push(num.get(i));
            }
            if (num.size() - (num.size() % k) <= i) {
                numLow.add(num.get(i));
            }
        }
        num.clear();
        for (Stack<Integer> it : newH) {
            while (!it.empty()) {
                num.add(it.pop());
            }
        }
        for (int it : numLow) {
            num.add(it);
        }
        ListNode newNode = null;
        ListNode newNode1 = null;
        for (int i = 0; i < num.size(); i++) {
            if (i == 0) {
                newNode = new ListNode(num.get(i));
                newNode1 = newNode;
                continue;
            } else {
                newNode.next = new ListNode(num.get(i));
                newNode = newNode.next;
            }
        }
        return newNode1;
    }

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reverseKGroup(a, 2);
    }
}
