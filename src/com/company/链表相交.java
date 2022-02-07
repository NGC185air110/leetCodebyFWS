package com.company;

public class 链表相交 {
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

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4);
        ListNode c = new ListNode(8);

        ListNode b = new ListNode(1);
        ListNode a = new ListNode(4);

        ListNode c1 = new ListNode(1);
        ListNode b1 = new ListNode(0);
        ListNode a1 = new ListNode(5);

        a1.next = b1;
        b1.next = c1;
        c1.next = c;
        c.next = d;
        d.next = e;
        a.next = b;
        b.next = c;

        getIntersectionNode(a, a1);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null) return null;
        if (headB == null) return null;
        ListNode startA = headA;
        ListNode startB = headB;
        boolean typeA = true;
        boolean typeB = true;
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
            if (headA == null && typeA) {
                headA = startB;
                typeA = false;
            }
            if (headB == null && typeB) {
                headB = startA;
                typeB = false;
            }
            if (headA == null && headB == null) {
                return null;
            }
        }
        return headA;
    }

}
