package com.company;

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
        int[] a = {2, 3, 4, 5};
        ListNode hh = new ListNode(1);
        ListNode ee = hh;
        for (int it : a) {
            hh.next = new ListNode(it);
            hh = hh.next;
        }
        middleNode(ee);
    }
}
