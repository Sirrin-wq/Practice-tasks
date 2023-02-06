package leetCode.medium;

/*
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)
 */

public class SwapNodesInPairs_24 {
    public Node swapPairs(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node t1=head;
        Node t2=head.next;

        while(t2!=null){
            int a=t1.val;
            int b=t2.val;
            t1.val=b;
            t2.val=a;

            if(t2.next==null){
                return head;
            }
            t1=t1.next.next;
            t2=t2.next.next;
        }
        return head;
    }
}

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}
