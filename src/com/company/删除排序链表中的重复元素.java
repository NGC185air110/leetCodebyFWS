package com.company;

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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode lazy = head;
        ListNode quick = lazy.next;
        while (quick != null) {
            while (quick != null && lazy.val == quick.val) {
                quick = quick.next;
            }
            lazy.next = quick;
            lazy = lazy.next;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode e = new ListNode(1);
        ListNode d = new ListNode(1, e);
        ListNode c = new ListNode(1, d);
        ListNode b = new ListNode(1, c);
        ListNode a = new ListNode(1, b);
        deleteDuplicates(a);
    }

}
