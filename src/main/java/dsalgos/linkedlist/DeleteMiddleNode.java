package dsalgos.linkedlist;

/**
 * You are given the head of a linked list. Delete the middle node,
 * and return the head of the modified linked list.
 * <p>
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node
 * from the start using 0-based indexing, where ⌊x⌋ denotes the
 * largest integer less than or equal to x.
 * <p>
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */
public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null) return head;

        if (head.next == null) return null;

        int length = 0;
        ListNode ptr = head;
        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }
        System.out.println(length / 2);

        ptr = head;
        for (int i = 0; i < length / 2 - 1; i++) {
            ptr = ptr.next;

        }

        ptr.next = ptr.next.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
