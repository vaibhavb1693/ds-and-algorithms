package com.trees;

public class BSTImplementation {

    //search
    public static boolean search(TreeNode root, TreeNode nodeToSearch) {
        if (root == null) {
            return false;
        }
        if (root.data == nodeToSearch.data) {
            return true;
        }
        if (nodeToSearch.data < root.data) {
            return search(root.left, nodeToSearch);
        } else if (nodeToSearch.data > root.data) {
            return search(root.right, nodeToSearch);
        }
        return false;
    }

    //insert
    public static TreeNode insert(TreeNode root, TreeNode nodeToInsert) {
        if (root == null) {
            root = nodeToInsert;
            return root;
        }
        if (nodeToInsert.data < root.data) {
            if(root.left==null)
                root.left=nodeToInsert;
            else
                insert(root.left,nodeToInsert);
        } else if (nodeToInsert.data > root.data) {
            if(root.right==null)
                root.right=nodeToInsert;
            else
                insert(root.right,nodeToInsert);
        }
        return root;
    }
    //inorder
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //preorder
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);
    }
    //postorder
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static TreeNode createBinarySearchTree()
    {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        insert(null,rootNode);
        insert(rootNode,node20);
        insert(rootNode,node10);
        insert(rootNode,node30);
        insert(rootNode,node60);
        insert(rootNode,node50);
        insert(rootNode,node70);
        insert(rootNode,node5);
        insert(rootNode,node55);
        return rootNode;
    }

    public static void main(String[] args)
    {
        // Creating a binary search tree
        TreeNode rootNode=createBinarySearchTree();
        TreeNode node55=new TreeNode(55);
        boolean result=search(rootNode,node55);
        System.out.println("Searching for node 55 : "+result);
        System.out.println("---------------------------");
        TreeNode node13=new TreeNode(13);
        TreeNode root=insert(rootNode,node13);
        System.out.println("Inorder traversal of binary tree after adding 13:");
        inOrder(root);

    }
}
