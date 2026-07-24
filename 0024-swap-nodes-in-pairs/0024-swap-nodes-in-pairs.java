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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy=new ListNode(-1);  //yeh toh create kiya kyunki swapping mein first node include hai head node 
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next != null && prev.next.next != null){      //bcoz values swap krni hai agar prev.next nhi hoga aur prev.next.next nhi hoga toh swap kaise honge
         ListNode first=prev.next;
        ListNode second=first.next;
        first.next=second.next;        //1-->3
        second.next=first;
        prev.next=second;
        prev=first;
        }
        return dummy.next;

    }
}