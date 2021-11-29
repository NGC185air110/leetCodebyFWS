package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 排序链表 {

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

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> newH = new ArrayList();
        newH.add(head.val);
        while (head.next != null) {
            head = head.next;
            newH.add(head.val);
        }
        newH.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        ListNode a = null;
        ListNode b = null;
        for (int i = 0; i < newH.size(); i++) {
            if (i == 0) {
                a = new ListNode(newH.get(0));
                b = a;
            } else {
                a.next = new ListNode(newH.get(i));
                a = a.next;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        ListNode e = new ListNode(0);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(5, c);
        ListNode a = new ListNode(-1, b);
        ListNode one = new ListNode(2, a);
        sortList(one);

    }


}
