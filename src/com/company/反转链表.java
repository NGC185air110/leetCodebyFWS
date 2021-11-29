package com.company;

import java.util.Stack;

public class 反转链表 {
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
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reverseList(a);
    }

    public static ListNode reverseList(ListNode head) {
        /*if (head == null) return head;
        Stack<ListNode> nodeS = new Stack<>();
        while (head != null) {
            nodeS.push(new ListNode(head.val));
            head = head.next;
        }
        ListNode newH = nodeS.pop();
        ListNode newH1 = newH;
        while (!nodeS.empty()) {
            newH.next = nodeS.pop();
            newH = newH.next;
        }
        return newH1;*/

        if(head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
