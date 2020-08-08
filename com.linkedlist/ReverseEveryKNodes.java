package com.linkedlist;

public class ReverseEveryKNodes {

    static class LinkedList {

        private Node head;

        static class Node {
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

        //reverse k nodes
        public static Node reverseRecursivelyKNodes(Node head, int k) {

            if (head == null) {
                return head;
            }

            Node current = head;
            Node previous = null;
            int count = 0;

            while (current != null && count++ < k) {

                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            head.next = reverseRecursivelyKNodes(current, k);
            return previous;

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node head = new LinkedList.Node(1);
        list.addToTail(head);
        list.addToTail(new LinkedList.Node(2));
        list.addToTail(new LinkedList.Node(3));
        list.addToTail(new LinkedList.Node(4));
        list.addToTail(new LinkedList.Node(5));
        list.addToTail(new LinkedList.Node(6));
        list.addToTail(new LinkedList.Node(7));
        list.addToTail(new LinkedList.Node(8));
        list.addToTail(new LinkedList.Node(9));
        list.printLinkedList(head);
        LinkedList.Node reverseHead = LinkedList.reverseRecursivelyKNodes(head, 3);
        System.out.println("After reversing every 3 elements");
        list.printLinkedList(reverseHead);
    }
}
