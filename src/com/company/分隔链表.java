package com.company;

//未能征服的海域
public class 分隔链表 {
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

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode more = new ListNode(-1);
        ListNode moreA = more;
        ListNode less = new ListNode(-1);
        ListNode lessA = less;

        while (head != null) {
            if (head.val < x) {
                lessA.next = head;
                lessA = lessA.next;
            } else {
                moreA.next = head;
                moreA = moreA.next;
            }
            head = head.next;
        }
        moreA.next = null;
        lessA.next = more.next;
        return less.next;
    }

    public static void main(String[] args) {

        ListNode g = new ListNode(2);
        ListNode f = new ListNode(2);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(2, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(1);
        ListNode a = new ListNode(2, b);
        partition(a, 2);
    }

}
