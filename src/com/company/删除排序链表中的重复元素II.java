package com.company;

public class 删除排序链表中的重复元素II {
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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        boolean type = false;
        ListNode top = new ListNode(-1, head);
        ListNode newA = top;
        ListNode lazy = head;
        ListNode quick = head.next;
        while (quick != null) {
            while (quick != null && lazy.val == quick.val) {
                quick = quick.next;
                type = true;
            }
            if (type) {
                newA.next = quick;
                lazy = quick;
            } else {
                newA = newA.next;
                lazy = lazy.next;
            }
            if (quick != null) {
                quick = quick.next;
            }
            type = false;
        }
        return top.next;
    }

    public static void main(String[] args) {

        ListNode g = new ListNode(5);
        ListNode f = new ListNode(4, g);
        ListNode e = new ListNode(4, f);
        ListNode d = new ListNode(3, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(1);
        ListNode a = new ListNode(1, b);
        deleteDuplicates(a);
    }
}
