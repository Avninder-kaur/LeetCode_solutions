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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        if(fast != null){
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode newhead=slow;
        ListNode next;
        while(newhead != null){
            next=newhead.next;
            newhead.next=prev;
            prev=newhead;
            newhead=next;
        }
        ListNode p1=head;
        ListNode p2=prev;
        while(p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;

    }
}