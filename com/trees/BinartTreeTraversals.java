package com.trees;

public class BinartTreeTraversals {

    public static void main(String[] args) {
        TreeNode root = createTreeUtil();
        inorder(root);
        preorder(root);
        postorder(root);
    }

    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void preorder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(TreeNode root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
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
