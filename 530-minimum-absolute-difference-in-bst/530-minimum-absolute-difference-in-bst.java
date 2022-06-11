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
        public int diff = Integer.MAX_VALUE;
        public TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return diff;
        
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        if(prev!=null){
            int dif= Math.abs(root.val-prev.val);
            diff = Math.min(diff,dif);
        }
        prev = root;
        inorder(root.right);
        
    }
}