package datastructures;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class ReverseLinkedList {


    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = list.createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original List:");
        list.printList(head);

        // Test Recursive Reversal
        Node reversedHeadRecur = list.reverseRecur1(head);
        System.out.println("Reversed List (Recursive):");
        list.printList(reversedHeadRecur);

        // Restore original list for iterative test
        head = list.createLinkedList(new int[]{1, 2, 3, 4, 5});

        // Test Iterative Reversal
        Node reversedHeadIter = list.reverseItrOpt(head);
        System.out.println("Reversed List (Iterative):");
        list.printList(reversedHeadIter);
    }
    public Node reverseRecur(Node head) {

        if(head.next == null) {
            return head;
        }

        Node node = reverseRecur(head.next);
        head.next.next = head;
        head.next = null;

        return node;
    }


    public Node reverseRecur1(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecur(head.next);
        head.next.next = head; // Properly reverses the next pointer
        head.next = null; // Prevents cycle

        return newHead; // New head of the reversed list
    }

    //return the new head of the node
    public Node reverseIterative(Node head) {

        Node node = head;
        Stack<Integer> stack  = new Stack<>();
        while(node != null) {
            stack.push(node.data);
            node = node.next;
        }


        Node start = null;
        while(!stack.isEmpty()) {
                if(start == null) {
                    start = new Node(stack.pop());
                    head = start;

                } else {
                    Node node1 = new Node(stack.pop());

                    start.next = node1;
                    start = node1;
                }
        }

        return head;
    }

    public Node reverseItrOpt(Node head) {

        Node prev = null;
        Node current = head;


        while(current != null) {
            Node node = current.next;

            current.next = prev;

            prev = current;
            current = node;

        }
        return  prev;
    }

    // Utility method to create a linked list from an array
    public Node createLinkedList(int[] values) {
        if (values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to print the linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
