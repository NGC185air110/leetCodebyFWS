package com.company;

public class 环形链表 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode quick = head;
        while (quick != null) {
            if (quick.next==null){
                return false;
            }
            head = head.next;
            quick = quick.next.next;
            if (head==quick){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode d = new ListNode(-4);
        ListNode c = new ListNode(0);
        ListNode b = new ListNode(2);
        ListNode a = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        hasCycle(a);
    }
}
