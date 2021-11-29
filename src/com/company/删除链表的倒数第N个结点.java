package com.company;

public class 删除链表的倒数第N个结点 {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode quick = head;
        ListNode lazy = head;
        for (int i = 0; i < n; i++) {
            quick = quick.next;
        }
        if (quick == null) {
            head = head.next;
            return head;
        }
        while (quick.next != null) {
            quick = quick.next;
            lazy = lazy.next;
        }
        lazy.next = lazy.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] a = {2};
        ListNode hh = new ListNode(1);
        ListNode ee = hh;
        for (int it : a) {
            hh.next = new ListNode(it);
            hh = hh.next;
        }
        removeNthFromEnd(ee, 1);

    }
}
