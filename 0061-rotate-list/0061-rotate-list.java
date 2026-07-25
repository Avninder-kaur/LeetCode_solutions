/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode curr=head;
        int count=0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int K = k % count;
        if(K == 0) return head;
        int toremove = count - K;
        ListNode tail = head;
        while(toremove > 1){
            tail = tail.next;
            toremove--;
        }
        ListNode newhead = tail.next;
        tail.next = null;
        ListNode lastnode = newhead;
        while(lastnode.next != null){
            lastnode = lastnode.next;
        }
    lastnode.next=head;
    head=newhead;
    return head;

    }
}