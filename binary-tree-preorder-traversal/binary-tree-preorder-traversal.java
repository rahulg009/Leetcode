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
    ArrayList<Integer> array = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null){
            return array;
        }
        traverse(root);
        return array;
        
    }
    public void traverse(TreeNode r){
        if(r==null){
            return;
        }
        array.add(r.val);
        if(r.left!=null){
            traverse(r.left);
        }
        if(r.right!=null){
            traverse(r.right);
        }
    }
}