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
        return head;
    }

    public static void main(String[] args) {

        ListNode g = new ListNode(2);
        ListNode f = new ListNode(5, g);
        ListNode e = new ListNode(2, f);
        ListNode d = new ListNode(0, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(4, c);
        ListNode a = new ListNode(1, b);
        partition(a, 3);
    }

}
