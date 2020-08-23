package com.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeReverseLevelOrderTraversal {


    public static void main(String[] args) {
        reverseLevelOrderTraversal(createTreeUtil());
    }

    public static void reverseLevelOrderTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.right != null) {
                queue.add(node.right);
            }
            if(node.left != null) {
                queue.add(node.left);
            }
            stack.add(node);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
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
