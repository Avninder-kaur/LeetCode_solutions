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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=newhead;
        ListNode next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // int sum=0;
        ListNode mainhead=head;
        int ans=0;
        while(mainhead !=null && prev != null){
            int currentwin=mainhead.val + prev.val;
             ans=Math.max(ans,currentwin);
          mainhead=mainhead.next;
          prev=prev.next;  
        }
        return ans;
    }
}