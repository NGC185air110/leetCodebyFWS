package com.company;

public class 重排链表 {
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

    public static void reorderList(ListNode head) {
        //我的递归
        /*if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode top = head;
        ListNode nextTop = top.next;
        while (head.next.next != null) {//找倒数第二
            head = head.next;
        }
        ListNode lost = head.next;
        lost.next = nextTop;
        head.next = null;
        top.next = lost;
        reorderList(nextTop);*/

        //1ms的递归
        /*int len = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        recursion(head, 1, len);*/

        // 找中点+反转后半部分+合并前后两部分
        if(head==null || head.next==null || head.next.next==null)return;

        // 1. 找中点，让slow指向中点，或左中点位置
        ListNode slow = head, fast = head.next;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. 断开中点，反转后半部分
        ListNode head2 = null, next = slow.next;
        slow.next = null;
        slow = next;
        while(slow != null) {
            next = slow.next;
            slow.next = head2;
            head2 = slow;
            slow = next;
        }

        // 3. 合并链表head和head2
        ListNode curr = head;
        ListNode curr2 = head2;
        while(curr != null && curr2!=null) {
            next = curr.next;
            curr.next = curr2;
            curr2 = curr2.next;
            curr.next.next = next;
            curr = next;
        }
    }

    private static ListNode recursion(ListNode head, int index, int len) {
        if(index==(len+1)/2){
            if((len&1)==0){
                ListNode t=head.next.next;
                head.next.next=null;
                return t;
            }else{
                ListNode t=head.next;
                head.next=null;
                return t;
            }
        }
        ListNode node=recursion(head.next,index+1,len);
        ListNode next=node.next, hnext=head.next;
        head.next=node;
        node.next=hnext;
        return next==null?head:next;
    }


    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);
        reorderList(a);
        System.out.println(a);
    }
}
