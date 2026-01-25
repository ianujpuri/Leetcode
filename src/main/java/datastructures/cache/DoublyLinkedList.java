package datastructures.cache;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {

    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete(int data) {
        Node curNode = head;
        if(head.data == data){
            head = head.next;
            head.prev = null;
            return;
        } else if(tail.data == data) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        while (curNode.next != null) {
            if (curNode.data == data) {
                curNode.prev.next = curNode.next;
                curNode.next.prev = curNode.prev;
                break;
            }

            curNode = curNode.next;
        }
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuffer result = new StringBuffer();
        while (current != null) {
            result.append(current.getData());
            if(current.next != null) {
                result.append(", ");
            }

            current = current.next;
        }
        return result.toString();
    }

    private class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }
}
