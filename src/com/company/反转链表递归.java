package com.company;

public class 反转链表递归 {
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

    static ListNode as = null;
    static ListNode top = null;
    static ListNode star = null;


    public static ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (star == null) {
            star = head;
        }
        ListNode as = reverseList(head.next);
        if (as == null) {
            as = head;
            top = as;
        } else {
            as.next = head;
            head.next = null;
        }
        System.out.println(head.val);
        if (head == star) {
            return top;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode f = new ListNode(6);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reverseList(a);
    }
}
