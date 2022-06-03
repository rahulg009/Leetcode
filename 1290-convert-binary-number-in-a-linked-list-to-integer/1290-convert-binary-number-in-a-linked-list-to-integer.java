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
    public int getDecimalValue(ListNode head) {
        
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        
        while(curr!=null){
            sb.append(String.valueOf(curr.val));
            curr = curr.next;
        }
        
        String ans =sb.toString();
        return Integer.parseInt(ans,2);
        
    }
}