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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(left == right) return head;
        
        ListNode prev =null; ListNode curr = head;
        
        for(int i=0;i<left-1 && curr!=null;i++){
            prev = curr;
            curr=curr.next;
        }
        
        ListNode lastIndex = prev;
        ListNode lastIndexOfrev = curr;
        ListNode next =null;
        
        for(int i=0;curr!=null && i<right-left+1;i++){
            
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        
        if(lastIndex!=null){
            lastIndex.next = prev;
            
        }else{
            head = prev;
        }
        
        lastIndexOfrev.next = curr;
        
        return head;
        
    }
}