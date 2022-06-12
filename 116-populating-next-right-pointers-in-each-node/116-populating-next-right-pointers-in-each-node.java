/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
            Queue<Node> q=new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
        int n=q.size();
        for(int i=0;i<n;i++){
           Node t= q.poll();
            if(t!=null){
            if(t.left!=null)q.offer(t.left);
            if(t.right!=null)q.offer(t.right);
            if(i==n-1)t.next=null;
            else t.next=q.peek();
        }
        }
    }
    return root;
    }
}