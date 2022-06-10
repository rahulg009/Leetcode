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
    public void flatten(TreeNode root) {
        
        if(root==null) return ;
        
        Queue<TreeNode> q = new LinkedList();
        
        preOrder(root,q);
        
        q.remove();
        
        TreeNode temp = root;
        
        while(!q.isEmpty()){
            temp.right = q.remove();
            temp.left=null;
            temp=temp.right;
            
        }
    }
    
    public void preOrder(TreeNode root,Queue<TreeNode> q){
        
        if(root ==null) return ;
        
        q.add(root);
        preOrder(root.left,q);
        preOrder(root.right,q);
    }
}