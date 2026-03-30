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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int ct=0;
        while(curr!=null && ct<k){
            curr=curr.next;
            ct++;
        }if(ct<k) return head;
        ListNode prev=null,next=null;
        curr=head;
        for(int i=0;i<k;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
        
    }
}
