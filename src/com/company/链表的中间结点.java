package com.company;

import java.util.HashMap;
import java.util.Map;

public class 链表的中间结点 {
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

    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode lazy = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            lazy = lazy.next;
            quick = quick.next.next;
        }
        return lazy;
    }

    public static void main(String[] args) {
        int[] a = {1,2, 3, 4, 5};
        ListNode hh = new ListNode();
        ListNode ee = hh;
        for (int it : a) {
            hh.next = new ListNode(it);
            hh = hh.next;
        }

        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("a","b");

        middleNode(ee.next);
    }
}
