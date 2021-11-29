package com.company;

public class 合并两个有序链表 {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newH = null;
        ListNode newA = null;
        while (list1 != null || list2 != null) {
            if (list1.val > list2.val) {
                if (newH == null) {
                    newH = new ListNode(list1.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list1.val);
                }
                list1 = list1.next;
            } else {
                if (newH == null) {
                    newH = new ListNode(list2.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list2.val);
                }
                list2 = list2.next;
            }
        }
        return newA;
    }

    public static void main(String[] args) {
        ListNode c = new ListNode(4);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);

        ListNode c1 = new ListNode(4);
        ListNode b1 = new ListNode(3, c1);
        ListNode a1 = new ListNode(1, b1);

        mergeTwoLists(a, a1);
    }


}
