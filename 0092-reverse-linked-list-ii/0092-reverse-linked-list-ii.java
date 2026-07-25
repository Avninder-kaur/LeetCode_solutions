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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode beforeleft=dummy;
        
        for(int i = 1; i < left; i++){
            beforeleft=beforeleft.next;
        }
        ListNode leftNode=beforeleft.next;
        ListNode prev=null;
        ListNode curr=beforeleft.next;
        ListNode next;
        for(int i=1;i<=right-left+1;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        beforeleft.next=prev;
        leftNode.next=curr;
        return dummy.next;
    }
}