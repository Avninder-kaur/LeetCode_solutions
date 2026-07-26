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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2= new ListNode(0);
        ListNode p1=dummy1;
        ListNode p2=dummy2;
        ListNode curr=head;
        while(curr != null){
            if(curr.val < x){
                p1.next=curr;
                p1=p1.next;
            }
            else{
                p2.next=curr;
                p2=p2.next;
            }
            curr=curr.next;
        }
        p1.next=dummy2.next;
        p2.next=null;
        return dummy1.next;
    }
}