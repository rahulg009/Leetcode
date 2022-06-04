/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        if(head==null){
            return null;
        }
        flattenn(head);
        return head;
    }
    public Node flattenn(Node head){
        Node curr = head;
        Node pre = null;
        while(curr!=null){
            if(curr.child!=null){
                Node child = flattenn(curr.child);
                linklist(child,curr.next);
                linklist(curr,curr.child);
                curr.child= null;
                curr=child;
            }
            pre=curr;
            curr = curr.next;
        }
        return pre;
    }
    
    public void linklist(Node node1,Node node2){
        node1.next=node2;
        if(node2!=null){
            node2.prev=node1;
        }
    }
}