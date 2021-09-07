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
       ListNode temp=head;
        int count=0;
        while(count<k){
            if(temp==null){
                return head;
            }
            count++;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
            count+=1;
        }
        if(next!=null){
           ListNode resthead= reverseKGroup(next,k);
            head.next=resthead;
        }
        return prev;
    }
}