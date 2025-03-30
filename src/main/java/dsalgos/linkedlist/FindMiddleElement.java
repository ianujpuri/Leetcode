package dsalgos.linkedlist;

import datastructures.ReverseLinkedList;

import javax.sound.midi.Soundbank;

public class FindMiddleElement {


    public static void main(String[] args) {
        FindMiddleElement list = new FindMiddleElement();

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        FindMiddleElement.Node head = list.createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Original List:");
        list.printList(head);

        System.out.println(" Middle elemnt is : " + list.findMiddleElement(head).data);
    }

    public Node findMiddleElement(Node head) {
        Node slow = head;
        Node fast = slow;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Utility method to create a linked list from an array
    public FindMiddleElement.Node createLinkedList(int[] values) {
        if (values.length == 0) return null;
        FindMiddleElement.Node head = new FindMiddleElement.Node(values[0]);
        FindMiddleElement.Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new FindMiddleElement.Node(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to print the linked list
    public void printList(FindMiddleElement.Node head) {
        FindMiddleElement.Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    class Node {
        int data;
        FindMiddleElement.Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
