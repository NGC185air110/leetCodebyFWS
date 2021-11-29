package com.company;

public class 旋转链表 {

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

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        ListNode newH = head;
        int index = 1;
        while (head.next != null) {
            head = head.next;
            index++;
        }
        if (index == 1) return newH;
        head = newH;
        ListNode tail = null;
        int i = k % index;//需要移动的格子数
        for (int j = 0; j < index; j++) {
            if (j == (index - i)) {
                tail = head;
                break;
            } else {
                head = head.next;
            }
        }
        ListNode a = newH;
        for (int j = 0; j < index; j++) {
            if (j == (index - i - 1)) {
                a.next = null;
                break;
            } else {
                a = a.next;
            }
        }

        return nodeInsert(tail, newH);
    }

    public static ListNode nodeInsert(ListNode head, ListNode data) {
        ListNode n = data;
        ListNode p = head;
        if (n == null) {
            if (p == null) {
                return null;
            } else {
                return p;
            }
        } else {
            if (p == null) {
                return n;
            } else {
                if (head == null) {
                    n.next = head;
                    head = n;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = n;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        rotateRight(a, 2);
    }
}
