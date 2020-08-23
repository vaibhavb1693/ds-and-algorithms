package com.trees;

public class CheckIfBST {

    public static void main(String[] args) {
        TreeNode root = createTreeUtil();
        System.out.println("Is the given tree a binary tree ??");
        System.out.println(checkIfBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static boolean checkIfBST(TreeNode root, int min, int max) {
        if(root == null) {
            return  true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return checkIfBST(root.left, min, root.data) && checkIfBST(root.right, root.data, max);
    }

    public static TreeNode createTreeUtil() {
        TreeNode root = new TreeNode(30);
        TreeNode node5 = new TreeNode(5);
        TreeNode node25 = new TreeNode(25);
        TreeNode node20 = new TreeNode(20);
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);

        root.left = node20;
        root.right = node50;
        node20.left = node5;
        node20.right = node25;
        node50.left = node40;
        node50.right = node60;
        return root;
    }
}
