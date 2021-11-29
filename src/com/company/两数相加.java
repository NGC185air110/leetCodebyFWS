package com.company;

public class 两数相加 {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*ListNode newN = null;
        ListNode newA = null;
        boolean advance = false;//进一位
        while (l1 != null || l2 != null || advance) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int c = advance ? a + b + 1 : a + b;
            if (c >= 10) {
                c = c - 10;
                advance = true;
            } else {
                advance = false;
            }
            if (newN == null) {
                newN = new ListNode(c);
                newA = newN;
            } else {
                newN.next = new ListNode(c);
                newN = newN.next;
            }
        }
        return newA;*/

        //最快的一秒
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t % 10);
            pre = pre.next;
            t /= 10;
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {

        int[] a = {};
        ListNode hh = new ListNode(9);
        ListNode ee = hh;
        for (int it : a) {
            hh.next = new ListNode(it);
            hh = hh.next;
        }

        int[] b = {9, 9};
        ListNode hh1 = new ListNode(1);
        ListNode ee1 = hh1;
        for (int it : b) {
            hh1.next = new ListNode(it);
            hh1 = hh1.next;
        }

        addTwoNumbers(ee, ee1);
    }
}
