package com.company;

public class 奇偶链表 {

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

    public static ListNode oddEvenList(ListNode head) {
        ListNode cw = head;//慢
        ListNode ccw = null;
        if (head != null && head.next != null) {
            ccw = head.next;//快
        }
        ListNode odd = null;//奇数
        ListNode even = null;//偶数
        while (1 == 1) {
            if (cw != null) {
                if (odd == null) {
                    odd = new ListNode(cw.val);
                } else {
                    odd = insert(odd, cw.val);
                }
                try {
                    cw = cw.next.next;
                } catch (Exception e) {
                    break;
                }

            }
            if (ccw != null) {
                if (even == null) {
                    even = new ListNode(ccw.val);
                } else {
                    even = insert(even, ccw.val);
                }
                try {
                    ccw = ccw.next.next;
                } catch (Exception e) {
                    break;
                }
            }

            if (cw == null && ccw == null) {
                break;
            }
        }
        return nodeInsert(odd, even);
    }

    public static ListNode insert(ListNode head, int data) {
        ListNode n = new ListNode(data);
        ListNode p = head;
        if (head == null) {
            n.next = head;
            head = n;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
        }
        return head;
    }

    public static ListNode nodeInsert(ListNode head, ListNode data) {
        ListNode n = data;
        ListNode p = head;
        if(n == null){
            if(p == null){
                return null;
            }else {
                return p;
            }
        }else {
            if (p == null){
                return n;
            }else {
                if (head == null) {
                    n.next = head;
                    head = n;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = n;
                }
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode g = new ListNode(7);
        ListNode f = new ListNode(6, g);
        ListNode e = new ListNode(5, f);
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1);

        oddEvenList(a);
    }
}
