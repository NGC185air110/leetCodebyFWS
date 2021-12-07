package com.company.didi;

public class 删除排序链表中的重复元素 {
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

    public static ListNode reverseList(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode tempNode = head;
        ListNode resultNode = new ListNode(head.val);
        for (; ; ) {
            if (null == tempNode.next) {
                break;
            }
            tempNode = tempNode.next;
            resultNode = new ListNode(tempNode.val, resultNode);
        }
        return resultNode;
    }

    public static ListNode reverseList1(ListNode head) {
        if (null == head) return null;
        ListNode lazy = null;
        ListNode quick = head;
        while (quick != null) {
            ListNode temp = quick.next;
            quick.next = lazy;
            lazy = quick;
            quick = temp;
        }
        return lazy;
    }

    public static void printListNode(ListNode node) {
        if (null == node) {
            return;
        }
        ListNode tempNode = node;
        for (; ; ) {
            System.out.print(tempNode.val + " ");
            if (null == tempNode.next) {
                break;
            }
            tempNode = tempNode.next;
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
}
