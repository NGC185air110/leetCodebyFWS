package com.company;

//完美拿下
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

    /*public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode newH = null;
        ListNode newA = null;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (newH == null) {
                    newH = new ListNode(list2.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list2.val);
                    newH = newH.next;
                }
                list2 = list2.next;
            } else if (list2 == null) {
                if (newH == null) {
                    newH = new ListNode(list1.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list1.val);
                    newH = newH.next;
                }
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                if (newH == null) {
                    newH = new ListNode(list2.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list2.val);
                    newH = newH.next;
                }
                list2 = list2.next;
            } else {
                if (newH == null) {
                    newH = new ListNode(list1.val);
                    newA = newH;
                } else {
                    newH.next = new ListNode(list1.val);
                    newH = newH.next;
                }
                list1 = list1.next;
            }
        }
        return newA;
    }*/


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
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
