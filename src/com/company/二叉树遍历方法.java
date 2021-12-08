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

    public static TreeNode createBT(int[] arr, int i)
    {
        TreeNode root = null; // 定义根节点

        if (i >= arr.length) // i >= arr.length 时,表示已经到达了根节点
            return null;

        root = new TreeNode(arr[i]); // 根节点
        root.left = createBT(arr, 2*i+1); // 递归建立左孩子结点
        root.right = createBT(arr, 2*i+2); // 递归建立右孩子结点

        return root;
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

        int[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = createBT(arr, 0);
    }
}
