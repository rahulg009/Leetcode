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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> sm = new Stack<ListNode>();
        ListNode curr = head;
        while(curr!=null){
            sm.push(curr);
            curr=curr.next;
            
        }
        curr = head;
        while(curr!= null || sm.isEmpty()==false){
            if(sm.peek().val==(curr.val)){
                curr=curr.next;
                sm.pop();
                
            }else{
                return false;
            }
        }
        return true;
        
        
    }
}