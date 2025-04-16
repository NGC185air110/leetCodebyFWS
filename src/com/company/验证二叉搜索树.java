package com.company;

public class 验证二叉搜索树 {

    public static void main(String[] args) {
        String a = "a";
        String b = a;
        a = "C";

        System.out.println(a);
        System.out.println(b);


        int[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = createBT(arr, 0);
        leftTree(root);
    }

    public static boolean isValidBST(TreeNode root) {
        leftTree(root);
        return false;
    }

    static void leftTree(TreeNode root) {
        if (root == null) return;
        leftTree(root.left);
        leftTree(root.right);
        System.out.println(root.val);
    }


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

    public static TreeNode createBT(int[] arr, int i) {
        TreeNode root = null; // 定义根节点
        if (i >= arr.length) { // i >= arr.length 时,表示已经到达了根节点
            return null;
        }
        root = new TreeNode(arr[i]); // 根节点
        root.left = createBT(arr, 2 * i + 1); // 递归建立左孩子结点
        root.right = createBT(arr, 2 * i + 2); // 递归建立右孩子结点

        return root;
    }
}
