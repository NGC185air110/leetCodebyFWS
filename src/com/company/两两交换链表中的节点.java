package com.company;

//easy 完美拿下
public class 两两交换链表中的节点 {

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

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        ListNode newH = new ListNode(-1);
        ListNode pre = newH;
        while (head != null) {
            ListNode top = head.next;
            if (top == null) {
                pre.next = head;
                break;
            }
            pre.next = top;
            head.next = head.next.next;
            top.next = head;
            head = head.next;
            pre = pre.next.next;
        }
        return newH.next;
    }

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);

        swapPairs(a);
    }

}
