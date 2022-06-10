/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> store = new ArrayList();
    int index =0;

    public BSTIterator(TreeNode root) {
        store = inOrder(root);
    }
    
    public int next() {
        int old = index;
        index++;
        if(old > store.size()) return 0;
        return store.get(old);
        
    }
    
    public boolean hasNext() {
        return index<store.size();
        
    }
    public List<Integer> inOrder(TreeNode root){
        if(root==null)return null;
        inOrder(root.left);
        store.add(root.val);
        inOrder(root.right);
        return store;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */