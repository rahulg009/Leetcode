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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddTemp = odd;
        ListNode evnTemp = even;
        int temp =0;
        
        while(head!=null){
             temp++;
            if(temp% 2 != 0){
                oddTemp.next = head;
                oddTemp = oddTemp.next;
            }else{
                evnTemp.next = head;
                evnTemp = evnTemp.next;
            }
            head = head.next;
        }
        
        evnTemp.next = null;
        oddTemp.next = even.next;
        return odd.next;
        
    }
}