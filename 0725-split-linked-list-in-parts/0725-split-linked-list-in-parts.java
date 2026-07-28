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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        int n=0;
        while(curr != null){
            n++;
            curr=curr.next;
        }
        int size=n/k;
        int extra=n%k;
        curr=head;
        ListNode []arr=new ListNode[k];
        for(int i=0;i<k;i++){
            if(curr==null){
                arr[i]=null;
                continue;
            }
            arr[i]=curr;
            int currentsize=size;
            if(extra > 0){
                currentsize++;
                extra--;
            }
            for(int j=1;j<currentsize;j++){
                curr=curr.next;
            }
            ListNode next=curr.next;
            curr.next=null;
            curr=next;
        }
        return arr;
    }
}