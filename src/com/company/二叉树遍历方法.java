package com.company;

//个人笔记
public class 二叉树遍历方法 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //前序
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "   ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + "   ");
            inOrder(root.right);
        }
    }

    //后序
    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + "   ");
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        e.right = h;
        c.right = f;
        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
    }
}
