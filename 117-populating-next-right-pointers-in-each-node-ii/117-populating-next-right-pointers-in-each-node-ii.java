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
        
        if(root==null){
            return root;
        }
        
        Queue<Node> q = new LinkedList();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            for(int i=0;i<n;i++){
                
                Node w = q.poll();
                if(i<n-1){
                    w.next=q.peek();
                }
                
                if(w.left!=null){
                    q.add(w.left);
                }
                if(w.right!=null){
                    q.add(w.right);
                }
                
            }
        }
        
        return root;
        
    }
}