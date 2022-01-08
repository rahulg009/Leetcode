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
    public int pairSum(ListNode head) {
        
        List<Integer> ar = new ArrayList();
        
        ListNode tp = head;
        
        while(tp!=null){
            ar.add(tp.val);
            tp=tp.next;
        }
        int sum=0;
        int n = ar.size();
        
        for(int i=0;i<n/2;i++){
            if(ar.get(i)+ar.get(n-i-1)>sum){
                sum = ar.get(i)+ar.get(n-i-1);
            }
        }
        return sum;
    }
}