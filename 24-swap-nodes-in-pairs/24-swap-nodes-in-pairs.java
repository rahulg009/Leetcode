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
        
        if(head == null || head.next ==null){
            return head;
        }
        
        ListNode curr = head;
        int temp = curr.val;
        
        curr.val= curr.next.val;
        curr.next.val = temp;
        
        head = curr;
        curr = curr.next.next;
        
        while(curr!=null && curr.next!=null){
            int it = curr.val;
            curr.val = curr.next.val;
            curr.next.val =it;
            curr=curr.next.next;
        }
        
        return head;
        
    }
}