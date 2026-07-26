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
        ListNode first = head;
        for(int i = 0; i < k - 1; i++){
            first = first.next;
        }
        ListNode slow = head;
        ListNode fast = first;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = first.val;
        first.val = temp;
        return head;
    }
}