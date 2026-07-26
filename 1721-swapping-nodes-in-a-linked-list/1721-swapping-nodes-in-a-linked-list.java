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
    public ListNode swapNodes(ListNode head, int k) {
        // ListNode first = head;
        // for(int i = 0; i < k - 1; i++){
        //     first = first.next;
        // }
        // ListNode slow = head;
        // ListNode fast = first;
        // while(fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        // int temp = slow.val;
        // slow.val = first.val;
        // first.val = temp;
        // return head;

        ListNode curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        ListNode first=curr;
        curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int moves=count-k;
        curr=head;
        while(moves>0){
            curr=curr.next;
            moves--;
        }
        ListNode second=curr;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;
    }
}