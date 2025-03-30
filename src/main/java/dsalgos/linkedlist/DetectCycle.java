package dsalgos.linkedlist;

public class DetectCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(DetectCycle.Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
                return true;
        }

        return false;
    }

    // Utility method to create a linked list from an array
    public DetectCycle.Node createLinkedList(int[] values) {
        if (values.length == 0) return null;
        DetectCycle.Node head = new DetectCycle.Node(values[0]);
        DetectCycle.Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new DetectCycle.Node(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to print the linked list
    public void printList(DetectCycle.Node head) {
        DetectCycle.Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    class Node {
        int data;
        DetectCycle.Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
