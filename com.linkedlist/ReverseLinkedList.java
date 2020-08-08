package com.linkedlist;

public class ReverseLinkedList {
    static class LinkedList {

        private Node head;

        private static class Node {
            private int value;
            private Node next;

            Node(int value) {
                this.value = value;
            }
        }

        //addToHead
        public void addToHead(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                head = node;
                head.next = temp;
            }
        }

        //addToTail
        public void addToTail(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        //print
        public void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //reverseLinkedList
        public static Node reverseLinkedList(Node currentNode) {
            Node previousNode = null;
            Node nextNode;
            while (currentNode != null) {
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
            }
            return previousNode;
        }

        //reverse recursive
        public static Node reverseRecursively(Node head) {

            if (head == null || head.next == null) {
                return head;
            }

            Node rest = reverseRecursively(head.next);
            head.next.next = head;
            head.next = null;

            return rest;
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Node head = new Node(1);
            list.addToTail(head);
            list.addToTail(new Node(2));
            list.addToTail(new Node(3));
            list.addToTail(new Node(4));
            list.addToTail(new Node(5));
            list.addToTail(new Node(6));
            list.addToTail(new Node(7));
            list.addToTail(new Node(8));
            list.addToTail(new Node(9));
            list.printLinkedList(head);
            Node reverseHead = reverseRecursively(head);
            System.out.println("After reversing");
            list.printLinkedList(reverseHead);
        }

    }
}

