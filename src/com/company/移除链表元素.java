package com.company;

/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 96.25%
 * 的用户
 * 内存消耗：
 * 39.5 MB
 * , 在所有 Java 提交中击败了
 * 18.86%
 * 的用户
 * 通过测试用例：
 * 66 / 66
 */
public class 移除链表元素 {
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

    /*public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return null;

        ListNode lazy = head;
        ListNode lazyNext = lazy.next;
        while (lazy != null) {
            if (lazyNext != null && lazyNext.val == val) {
                lazy.next = lazyNext.next;
            }else {
                lazy = lazy.next;
            }
            if (lazyNext != null) {
                lazyNext = lazyNext.next;
            }
        }
        return head;
    }*/
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode f = new ListNode(6);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(1);
        ListNode c1 = new ListNode(2, c);
        ListNode b = new ListNode(2, c1);
        ListNode a = new ListNode(1, b);
        removeElements(a, 2);
    }
}
