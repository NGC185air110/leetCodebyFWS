package com.company;

public class 合并两个链表 {
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
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        ListNode b1 = new ListNode(1000000);
        ListNode b2 = new ListNode(1000001);
        ListNode b3 = new ListNode(1000002);
        b1.next = b2;
        b2.next = b3;

        mergeInBetween(a1, 3, 4, b1);
    }


    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int index = 0;//从0开始取得a之前那个
        ListNode start = list1;
        ListNode start2 = list2;//拿个头
        ListNode start1 = null;
        ListNode end1 = null;

        while (list1.next != null || list2.next != null) {
            if (list1.next != null) {
                if (index == a - 1) {
                    System.out.println(list1.val);
                    start1 = list1;
                } else if (index == b) {
                    System.out.println(list1.val);
                    end1 = list1.next;
                }
                list1 = list1.next;
                index++;
            }
            if (list2.next != null) {
                list2 = list2.next;
            }
        }
        start1.next = start2;
        list2.next = end1;
        return start;
    }

}


