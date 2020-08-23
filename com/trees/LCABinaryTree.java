package com.trees;

public class LCABinaryTree {

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node10 = new TreeNode(60);
        TreeNode lca = findLCA(createTreeUtil(), node5, node10);
        System.out.println(lca.data);
    }

    public static TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b) {

        if(root == null) return null;

        if(root.data == a.data || root.data == b.data) {
            return root;
        }
        TreeNode left = findLCA(root.left, a, b);
        TreeNode right = findLCA(root.right, a, b);

        if(left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    public static TreeNode createTreeUtil() {
        TreeNode root = new TreeNode(20);
        TreeNode node5 = new TreeNode(5);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);

        root.left = node30;
        root.right = node40;
        node30.left = node5;
        node30.right = node10;
        node40.left = node50;
        node40.right = node60;
        return root;
    }
}
