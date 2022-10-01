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
    public int result =0;
    public int pseudoPalindromicPaths (TreeNode root) {
        solve(new int[9],root);
        return result;
    }
    
    public void solve(int[] store, TreeNode root){
        if(root==null)return;
        
        
        store[root.val-1]++;
        
        if(root.left == null && root.right == null && isPal(store))result++;
        
        solve(store,root.left);
        solve(store,root.right);
        
        store[root.val-1]--;
        
    }
    
    public  boolean isPal(int[] s){
        int o=0;
        
        for(int x:s){
            if(x%2==1){
                o++;
                if(o>1){
                    return false;
                }
            }
        }
        
        return true;
    }
}