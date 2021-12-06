package com.company.didi;


public class 反转链表 {

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

    //弟弟的
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (null == head || 0 > (left - 1) || 0 > (right - 1)) return null;
        if (left == right) {
            return head;
        }
        int index = 0;
        ListNode result1 = null;
        ListNode result1end = null;
        ListNode result2 = null;
        ListNode result3 = null;
        ListNode result2end = null;
        ListNode next = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while (next != null) {
            if (0 == index && left - 1 > 0) {
                result1 = new ListNode(next.val);
                temp1 = result1;
            }
            if (index < left - 2) {
                ListNode next1 = next.next;
                if (null != next1) {
                    temp1.next = new ListNode(next1.val);
                    temp1 = temp1.next;
                }
            }
            if (index > left - 2 && index < right) {
                result2 = new ListNode(next.val, result2);
            }
            if (index == left - 1) {
                result1end = temp1;
                result2end = result2;
            }
            if (index == right) {
                result3 = new ListNode(next.val);
                temp2 = result3;
            }
            if (index > right) {
                temp2.next = new ListNode(next.val);
                temp2 = temp2.next;
            }
            next = next.next;
            index++;
        }
        if (null != result1) {
            if (null != result1end) {
                result1end.next = result2;
            }
        } else {
            result1 = result2;
        }

        if (null != result2end) {
            result2end.next = result3;
        }
        return result1;
    }

    public static void swap(ListNode now, ListNode next) {
        now.next = next;
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

    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reverseBetween(a, 2, 4);
        //printListNode(a);
    }

    public static void printListNode(ListNode node) {
        if (null == node) {
            return;
        }
        ListNode zero = node;
        ListNode tempNode = node;
        ListNode kkk = null;
        for (; ; ) {
            System.out.print(tempNode.val + " ");
            if (null == tempNode.next) {
                break;
            }
            if (2 == tempNode.val) {
                kkk = tempNode;
            }
            if (4 == tempNode.val) {
                tempNode.val = 9;
            }
            tempNode = tempNode.next;
        }
        System.out.println();
        printListNode1(kkk);
        printListNode1(zero);
    }

    public static void printListNode1(ListNode node) {
        if (null == node) {
            return;
        }
        ListNode tempNode = node;
        ListNode kkk = null;
        for (; ; ) {
            System.out.print(tempNode.val + " ");
            if (null == tempNode.next) {
                break;
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

}
