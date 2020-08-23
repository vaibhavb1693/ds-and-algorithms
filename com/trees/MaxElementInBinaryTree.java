package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInBinaryTree {

    public static void main(String[] args) {
        System.out.println(getMaximumUsingIteration(createTreeUtil()));
    }

    public static int getMaximumUsingRecursion(TreeNode root) {

        int max = Integer.MIN_VALUE;
        if(root != null) {
            int left,right,value;
            value = root.data;
            left = getMaximumUsingRecursion(root.left);
            right = getMaximumUsingRecursion(root.right);
            if (left > right) {
                max = left;
            } else {
                max = right;
            }
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMaximumUsingIteration(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if(currentNode.data > max) {
                max = currentNode.data;
            }
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return max;
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
