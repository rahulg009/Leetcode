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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();
        if(root==null){
            return array;
        }
        traverse(root,array);
        return array;
    }
    public void traverse(TreeNode r,ArrayList<Integer> a){
        
        if(r.left!=null){
            traverse(r.left,a);
        }
        if(r.right!=null){
            traverse(r.right,a);
        }
        a.add(r.val);
    }
}