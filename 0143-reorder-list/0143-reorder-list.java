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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next != null && fast.next.next != null){
        slow=slow.next;
        fast=fast.next.next;                                //middle of linked list
       } 
        ListNode second = slow.next;                         //starting of next list first node
        slow.next = null;                                    //break the link of last node of first list
        ListNode prev = null;
        ListNode curr=second;
        ListNode next;
        while(curr != null){                                // reverse second half
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        ListNode first = head;
        second = prev;                                      //merging the two lists
        while(second != null){
            ListNode secondnext=second.next;
            ListNode firstnext=first.next;

            first.next=second;
            second.next=firstnext;

            first=firstnext;
            second=secondnext;
        }

    }
}