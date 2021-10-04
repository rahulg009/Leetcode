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
    public static TreeNode BuildTree(int[] preorder, int l, int r){
        if(l > r)
            return null;
        
        int right = preorder[l];
        int right_index = l;
        
        for(int i=l+1; i<=r; i++){
            if(preorder[i] > right){
                right_index = i;
                break;
            }
        }
        
        if(right_index == l)
            right_index = r+1;
        
        TreeNode root = new TreeNode();
        
        if(l == r){
            root.val = preorder[l];
            root.left = null;
            root.right = null;
        }
        else{
            root.val = preorder[l];
            root.left = BuildTree(preorder, l+1, right_index-1);
            root.right = BuildTree(preorder, right_index, r);
        }
        
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return BuildTree(preorder, 0, preorder.length-1);
    }
}