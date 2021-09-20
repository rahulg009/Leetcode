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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();
        if(root==null){
            return array;
        }
        
        resultinorder(root,array);
        return array;
        
    }
    
    public void resultinorder(TreeNode root,ArrayList<Integer> arr){
        TreeNode curr = root;
        if(curr==null)return;
        if(curr.left!=null){
            resultinorder(curr.left,arr);
        }
        arr.add(curr.val);
        if(curr.right!=null){
            resultinorder(curr.right,arr);
        }
    }
}