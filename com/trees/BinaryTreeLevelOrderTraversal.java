package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void levelOrderTraversal(TreeNode startNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(startNode);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {

        TreeNode rootNode=createBinaryTree();
        System.out.println("Level Order traversal of binary tree:");
        levelOrderTraversal(rootNode);
    }

    public static TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node60 = new TreeNode(60);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);
        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;

    }
}
