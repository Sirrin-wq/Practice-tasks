package leetCode.easy;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Definition for singly-linked list.
 public class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 */

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode end = head, mid = head;
        while(end != null && end.next != null){
            mid = mid.next;
            end = end.next.next;
        }
        return mid;
    }
}
