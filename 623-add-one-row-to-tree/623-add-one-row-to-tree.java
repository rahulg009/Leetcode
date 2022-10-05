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
class Solution {
    int d;
    int v;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        d= depth;
        v = val;
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        
        solve(root,1);
        return root;
    }
    public void solve(TreeNode root,int cur){
        if(root == null){
            return;
        }
        
        if(cur == d -1){
            TreeNode leftt = root.left;
            TreeNode addL = new TreeNode(v);
            root.left = addL;
            addL.left = leftt;
            
            TreeNode rightt = root.right;
            TreeNode addR = new TreeNode(v);
            root.right = addR;
            addR.right = rightt;
        }
        
        solve(root.left,cur+1);
        solve(root.right,cur+1);
    }
    
}