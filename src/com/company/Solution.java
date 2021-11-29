package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * title：
 * description：链表暴力搞定
 * author：dinglicheng on 2021/11/12 10:19
 */
class Solution {

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
        if (left == right) {
            return head;
        }
        //上一个
        ListNode nex = new ListNode();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 1; ; i++) {
            if (i == 1) {
                nex = head;
            } else {
                nex.val = nex.next.val;
                if (nex.next.next == null) {
                    a.add(nex.val);
                    break;
                }
                nex.next = nex.next.next;
            }
            a.add(nex.val);
        }
        List<Integer> b = new ArrayList<Integer>();//收集a
        for (int y = 0; y < a.size(); y++) {
            if (left - 1 <= y && right - 1 >= y) {
                b.add(a.get(y));
            }
        }
        Collections.reverse(b);
        int index = 0;
        for (int y = 0; y < a.size(); y++) {
            if (left - 1 <= y && right - 1 >= y) {
                a.set(y, b.get(index));
                index++;
            }
        }

        ListNode last = new ListNode();
        ListNode now = new ListNode();
        for (int x = a.size() - 1; x >= 0; x--) {
            if (x == a.size() - 1) {
                last = new ListNode(a.get(x));
            } else {
                now = new ListNode(a.get(x), last);
                last = now;
            }
        }
        return now;

    }

    public static void oneTow(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        ListNode z = new ListNode(6);
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);

        reverseBetween(e, 1, 4);

        int aa = 3;
        int bb = 4;
        int cc;
        cc = aa;
        aa = bb;
        bb = cc;
        System.out.println("---------"+aa+""+bb+"");
    }
}
