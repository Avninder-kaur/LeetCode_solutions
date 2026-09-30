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
            curr = curr.next;              // find the length of list
        }
        int K = k % count;                 
        if(K == 0) return head;
        int toremove = count - K;          // if count is 5 and k is 2 then 5-2=3    means tail currently at head after 3 moves becomes tail of list and next 2 remaing we have to shift forward 
        ListNode tail = head;
        while(toremove > 1){
            tail = tail.next;
            toremove--;
        }
        ListNode newhead = tail.next;        // which is newhead of list after tail 
        tail.next = null;                    // break the link 
        ListNode lastnode = newhead;
        while(lastnode.next != null){         //.next bcoz pointer stops at lastnode dont move forward
            lastnode = lastnode.next;
        }
    lastnode.next=head;                      //link lastnode to head
    head=newhead;                            //newhead ko head bna diya
    return head;

    }
}