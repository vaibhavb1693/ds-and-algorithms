package com.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeSpiralOrder {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void spiralOrderTraversal(TreeNode startNode) {
        if(startNode==null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(startNode);
        boolean directionFlag = true;
        while(!stack.isEmpty()) {
            Stack<TreeNode> tempStack=new Stack<>();
            while(!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                System.out.print(temp.data + " ");
                if(directionFlag) {
                    if (temp.left != null)
                        tempStack.push(temp.left);
                    if (temp.right != null)
                        tempStack.push(temp.right);
                }else {
                    if (temp.right != null)
                        tempStack.push(temp.right);
                    if (temp.left != null)
                        tempStack.push(temp.left);
                }
            }
            directionFlag = !directionFlag;
            stack = tempStack;
        }
    }

    public static void main(String[] args) {

        TreeNode rootNode=createBinaryTree();
        System.out.println("Spiral Order traversal:");
        spiralOrderTraversal(rootNode);
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

