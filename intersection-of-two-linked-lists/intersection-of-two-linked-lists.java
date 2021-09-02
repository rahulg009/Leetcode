/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs= new HashSet<>();
        ListNode p = headA;
        ListNode q= headB;
        while(p!=null){
            hs.add(p);
            p=p.next;
        }
        while(q!=null){
            if(hs.contains(q)){
                return q;
            }
            q=q.next;
        }
        return null;
        
    }
}