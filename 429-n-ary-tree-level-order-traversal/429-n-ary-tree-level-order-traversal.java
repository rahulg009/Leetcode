/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> store = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(root==null)return store;
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> thiss = new ArrayList<>();
            int len = q.size();
            
            for(int i=0;i<len;i++){
                Node curr = q.poll();
                thiss.add(curr.val);
                 for(int j=0;j<curr.children.size();j++){
                q.add(curr.children.get(j));
            }
            }
            
           
            
            store.add(thiss);
        }
        
        return store;
        
    }
}