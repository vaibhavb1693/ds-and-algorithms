package com.trees;

public class PrintLeafNodes {

    public static void main(String[] args) {
        printLeafNodes(createTreeUtil());
    }

    public static void printLeafNodes(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            System.out.print( root.data + "  ");
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
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
