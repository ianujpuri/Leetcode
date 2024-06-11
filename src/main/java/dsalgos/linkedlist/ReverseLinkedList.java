package dsalgos.linkedlist;

public class ReverseLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    ListNode nHead = null;
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }

        resvese(head, null);

        return nHead;
    }

    public ListNode resvese(ListNode head, ListNode prev) {
        if(head == null) {
            nHead = prev;
            return prev;
        }

        ListNode node = resvese(head.next, head);
        head.next = prev;
        return head;
    }
}