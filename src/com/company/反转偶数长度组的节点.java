package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 反转偶数长度组的节点 {
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

    public static ListNode reverseEvenLengthGroups(ListNode head) {
        /*List<List<Integer>> newList = new ArrayList<>();
        List<Integer> newListNode = new ArrayList<>();

        int newListNodeSize = 1;
        while (head != null) {
            if (newListNode.size() >= newListNodeSize) {
                newListNodeSize++;
                if (newListNode.size() % 2 == 0) {
                    Collections.reverse(newListNode);
                }
                newList.add(newListNode);
                newListNode = new ArrayList<>();
            }
            newListNode.add(head.val);
            head = head.next;
        }
        if (newListNode.size() % 2 == 0) {
            Collections.reverse(newListNode);
        }
        newList.add(newListNode);
        ListNode newN = null;
        ListNode newN1 = null;
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 0; j < newList.get(i).size(); j++) {
                if (i == 0 && j == 0) {
                    newN = new ListNode(newList.get(i).get(j));
                    newN1 = newN;
                } else {
                    newN.next = new ListNode(newList.get(i).get(j));
                    newN = newN.next;
                }
            }
        }
        return newN1;*/


        // 代表当前的节点
        ListNode cur = head;
        // 统计每个字节点中的节点个数
        int count = 0;
        // 代表当前是第几段节点
        int base = 1;


        ListNode pre = head;
        ListNode start = head;
        ListNode next = head;

        while (cur != null) {
            count++;
            if (count == base) {
                if (count % 2 == 0) {
                    // 把下cur的下一个节点先记录下来，因为这是下一段的开始节点
                    // 然后吧cur的下一个节点设置为null，方便反转链表
                    next = cur.next;
                    cur.next = null;
                    // 待反转链表的开始节点是上一段节点的next下一个节点
                    // 同时这个节点也是链表反转后的最后一个节点
                    start = pre.next;
                    // 进行翻转链表，得到的是链表反转后的头部，与上一段链表进行连接
                    pre.next = reverse(start);
                    // 与后一段链表进行连接
                    start.next = next;
                    // 更新当前指针的位置（由于反转链表了，所以由头部变为尾部）
                    cur = start;
                }
                // 这个是每一段开始的公共代码，无论是否为偶数长度都要记录更新
                pre = cur;
                base++;
                // 将count清零
                count = 0;
            }
            cur = cur.next;
        }

        // 剩下的最后一段如果也是偶数段，那么也再反转一下
        if (count % 2 == 0) {
            pre.next = reverse(pre.next);
        }

        return head;
    }

    // 反转链表
    public static ListNode reverse(ListNode node) {
        ListNode pre = null;

        while (node != null) {
            ListNode nextNode = node.next;
            node.next = pre;
            pre = node;
            node = nextNode;
        }

        return pre;

    }

    public static void main(String[] args) {
        int[] a = {14, 13, 15, 6, 12, 18, 17, 2, 10, 13, 10, 16, 14, 17, 8, 15, 5, 6, 16, 17, 19, 8, 4, 14, 7, 14};
        ListNode hh = new ListNode(17);
        ListNode ee = hh;
        for (int it : a) {
            hh.next = new ListNode(it);
            hh = hh.next;
        }

        reverseEvenLengthGroups(ee);
    }
}
