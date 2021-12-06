package com.company;

public class 进阶反转链表 {
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

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) return head;
        //复制准备O(n)
        ListNode copy = head;
        //第一次进区间的入口
        ListNode entrance = null;
        //区间之前一位
        ListNode top = null;
        //区间出口
        ListNode export = null;
        // 头插排序
        ListNode pre = null;
        //计数
        int index = 1;
        while (copy != null) {
            if (index < left) {
                //记录入口前
                top = copy;
            }
            if (index >= left && index <= right) {
                //记录入口
                if (index == left) {
                    entrance = copy;
                }
                //记录出口
                if (index == right) {
                    ListNode temp = copy.next;
                    copy.next = pre;
                    export = copy;

                    if (top != null) {
                        top.next = export;
                    }
                    entrance.next = temp;
                    if (top == null) {
                        return export;
                    }
                    break;
                }
                //反转
                ListNode temp = copy.next;
                copy.next = pre;
                pre = copy;
                copy = temp;
                index++;
                continue;
            }
            index++;
            copy = copy.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode g = new ListNode(7);
        ListNode f = new ListNode(6, g);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reverseBetween(a, 1, 3);
    }
}
