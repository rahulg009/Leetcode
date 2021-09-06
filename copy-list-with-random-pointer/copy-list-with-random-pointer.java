/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node temp = head;
        Map<Node,Node> hm= new HashMap<>();
        
        while(temp!=null){
            Node myClone = new Node(temp.val);
            hm.put(temp,myClone);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node myClone = hm.get(temp);
            myClone.next = hm.get(temp.next);
            myClone.random = hm.get(temp.random);
            temp=temp.next;
        }
        
        return hm.get(head);
        
    }
}