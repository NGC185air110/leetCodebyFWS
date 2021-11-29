package com.company;

public class 环形链表2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode j = new ListNode(10);
        ListNode i = new ListNode(9, j);
        ListNode h = new ListNode(8, i);
        ListNode g = new ListNode(7, h);
        ListNode f = new ListNode(6, g);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        j.next = g;
        detectCycle(a);

    }

    public static ListNode detectCycle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        ListNode slow1 = head;
        while (quick != null) {
            if (quick.next==null){
                return null;
            }
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow) {
                while (slow1 != slow) {
                    slow1 = slow1.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
