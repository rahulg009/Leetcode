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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> store = new PriorityQueue<>();
        
        for(ListNode u:lists){
            ListNode temp=u;
            
            while(temp!=null){
                store.add(temp.val);
                temp=temp.next;
            }
        }
        
        if(store.size()==0){
            return null;
        }
        
        ListNode res = new ListNode(store.poll());
        ListNode ans = res;
        int len = store.size();
        for(int j=1;j<len+1;j++){
            res.next = new ListNode(store.poll());
            res=res.next;
            
        }
        
        res.next=null;
        
        return ans;
        
        
        
        
        
    }
}