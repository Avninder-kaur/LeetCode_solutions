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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode curr = l1;
        while (curr != null) {
            st1.push(curr.val);
            curr = curr.next;
        }
        ListNode curr1 = l2;
        while (curr1 != null) {
            st2.push(curr1.val);
            curr1 = curr1.next;
        }
        int carry = 0;
        int digit = 0;
        ListNode head = null;
        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
            int x = 0;
            if (!st1.isEmpty()) {
                x = st1.pop();
            }
            int y = 0;
            if (!st2.isEmpty()) {
                y = st2.pop();
            }
            int sum = x + y + carry;
            digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}