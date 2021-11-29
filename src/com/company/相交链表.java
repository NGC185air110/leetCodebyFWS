package com.company;

//奇偶链表
public class 相交链表 {
    public static void main(String[] args) {
        ListNode a5 = new ListNode(5);
        ListNode a4 = new ListNode(4, a5);
        ListNode a3 = new ListNode(8, a4);
        ListNode a2 = new ListNode(1, a3);
        ListNode a1 = new ListNode(4, a2);

        ListNode b3 = new ListNode(1);
        ListNode b2 = new ListNode(6, b3);
        ListNode b1 = new ListNode(5, b2);
        getIntersectionNode(a1, b1);
    }

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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode newA = headA;
        ListNode newB = headB;
        while (newA != newB) {
            if (newA == null) {
                newA = headB;
            } else {
                newA = newA.next;
            }
            if (newB == null) {
                newB = headA;
            } else {
                newB = newB.next;
            }
        }
        return newA;
    }

}
