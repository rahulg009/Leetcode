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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        int len=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            len+=1;
        }
        ListNode curr=head;
        ListNode prev=null;
    if(len == n){
        curr = curr.next;
        head.next = null; 
        return curr;
    }
        for(int i=1;i<len-n+1;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
    }
}