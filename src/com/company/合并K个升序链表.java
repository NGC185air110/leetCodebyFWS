package com.company;

import java.util.PriorityQueue;

public class 合并K个升序链表 {

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

        public static ListNode mergeKLists(ListNode[] lists) {
            return merge(lists, 0, lists.length - 1);
        }

        public static ListNode merge(ListNode[] lists, int l, int r) {
            if (l == r) {
                return lists[l];
            }
            if (l > r) {
                return null;
            }
            int mid = (l + r) >> 1;
            return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
        }

        public static ListNode mergeTwoLists(ListNode a, ListNode b) {
            if (a == null || b == null) {
                return a != null ? a : b;
            }
            ListNode head = new ListNode(0);
            ListNode tail = head, aPtr = a, bPtr = b;
            while (aPtr != null && bPtr != null) {
                if (aPtr.val < bPtr.val) {
                    tail.next = aPtr;
                    aPtr = aPtr.next;
                } else {
                    tail.next = bPtr;
                    bPtr = bPtr.next;
                }
                tail = tail.next;
            }
            tail.next = (aPtr != null ? aPtr : bPtr);
            return head.next;
        }

    /*public static ListNode mergeKLists(ListNode[] lists) {
     *//*for (int i = 0; i < lists.length; i++) {
            //横向打印
            *//**//*while (lists[i] != null) {
                System.out.println(lists[i].val + "");
                lists[i] = lists[i].next;
            }*//**//*

        }*//*
        //竖向打印
        int a = 0;
        if (lists == null || lists.length == 0) return null;
        for (ListNode it : lists) {
            if (it == null) {
                a++;
            }
        }
        if (a == lists.length) {
            return null;
        }
        Set<Integer> insurance = new HashSet<>();
        ListNode newN = new ListNode(-1);
        ListNode newA = newN;
        while (true) {
            if (insurance.size() == lists.length - a) {
                return newN.next;
            }
            //比小
            int value = 10_001, index = 0;
            ListNode node = null;
            for (int j = 0; j < lists.length; j++) {
                if (lists[j] == null) {
                    continue;
                }
                if (value > lists[j].val) {
                    node = lists[j];
                    value = lists[j].val;
                    index = j;
                }
            }
            newA.next = node;
            newA = newA.next;
            if (lists[index] != null) {
                lists[index] = lists[index].next;
            }
            if (lists[index] == null) {
                insurance.add(index);
            }
        }
    }*/

    public static void main(String[] args) {
        ListNode c = new ListNode(5);
        ListNode b = new ListNode(4, c);
        ListNode a = new ListNode(1, b);

        ListNode c1 = new ListNode(4);
        ListNode b1 = new ListNode(3, c1);
        ListNode a1 = new ListNode(1, b1);

        ListNode b2 = new ListNode(6);
        ListNode a2 = new ListNode(2, b2);

        ListNode[] lists = {null, a2};
        mergeKLists(lists);
    }
}
