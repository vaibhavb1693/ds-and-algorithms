package com.linkedlist;

public class SortedLinkedlistToBalancedBST {

    private Node head;

    private static class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    private static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int value) {
            this.value = value;
        }
    }

    //addtohead
    public void addToHead(Node node) {
        if (head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    //addtotail
    public void addToTail(Node node) {
        if (head == null) {
            head = node;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //length of Linked list
    public int lengthOfLinkedList()
    {
        Node temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    //print linkedlist
    public void printLinkedList(Node head) {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public TreeNode convertSortedLinkedListToBST(int n) {

        if (n <= 0) {
            return null;
        }

        TreeNode left = convertSortedLinkedListToBST(n/2);
        TreeNode root = new TreeNode(head.value);
        root.left = left;
        head = head.next;
        root.right = convertSortedLinkedListToBST(n - n/2 - 1);
        return root;
    }

    public static void main(String[] args) {
        SortedLinkedlistToBalancedBST list = new SortedLinkedlistToBalancedBST();
        // Creating a linked list
        Node head = new Node(10);
        list.addToTail(head);
        list.addToTail(new Node(20));
        list.addToTail(new Node(30));
        list.addToTail(new Node(40));
        list.addToTail(new Node(50));
        list.addToTail(new Node(60));
        list.addToTail(new Node(70));
        list.addToTail(new Node(80));
        list.addToTail(new Node(90));
        System.out.println("Printing linked list ");
        list.printLinkedList(head);
        int n = list.lengthOfLinkedList();
        TreeNode bst=list.convertSortedLinkedListToBST(n);
        System.out.println("");
        System.out.println("Pre order traversal:");
        preOrderTraversal(bst);
    }
}

