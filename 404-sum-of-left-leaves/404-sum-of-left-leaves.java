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
    public  int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        boolean flag = false;
        return solve(root,flag);
    }
    
    public int solve(TreeNode root,boolean flag){
        if(root ==null)return 0;
        
        if(root.left==null && root.right==null && flag){
            sum+=root.val;
        }
        solve(root.left,true);
        solve(root.right,false);
        
        return sum;
    }
}