package com.company;

import java.util.HashMap;
import java.util.Map;

public class 复杂链表的复制 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static Map<Node, Node> cachedNode = new HashMap<Node, Node>();

    public static Node copyRandomList(Node head) {
        /*Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        Node cur1 = head;
        while (cur1 != null) {
            map.get(cur1).next = map.get(cur1.next);
            map.get(cur1).random = map.get(cur1.random);
            cur1 = cur1.next;
        }
        return map.get(head);*/

        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);

    }

    public static void main(String[] args) {
        Node e = new Node(1);
        Node d = new Node(10);
        Node c = new Node(11);
        Node b = new Node(13);
        Node a = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;
        copyRandomList(a);
    }

}
