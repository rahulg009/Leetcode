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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            TreeNode store = root.left;
            return addNode(root.right,store);
            
        }
        return root;
        
    }
    public TreeNode addNode(TreeNode root,TreeNode st){
            if(root==null){
                return st;
            }
            if(st==null){
                return root;
            }
            if(root.val>st.val){
                root.left = addNode(root.left,st);
            }else{
                root.right = addNode(root.right,st);
            }
            return root;
        }
}