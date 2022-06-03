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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode lessthan = new ListNode(-1);
        ListNode greater = new ListNode(-1);
        ListNode lessg = lessthan;
        ListNode lg = greater;
        
        
        while(head!=null){
            if(head.val<x){
                lessg.next = new ListNode(head.val);
                lessg = lessg.next;
            }else{
                lg.next = new ListNode(head.val);
                lg=lg.next;
            }
            
            head = head.next;
        }
        
        lessg.next = greater.next;
        
        return lessthan.next;
        
    }
}