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
    List<Integer> bst = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        create(root);
        for(int i=1; i<bst.size(); i++){
            if(bst.get(i-1)>=bst.get(i)) return false;
        }
        return true;
    }
    public void create(TreeNode root){
        if(root!=null){
            create(root.left);
            bst.add(root.val);
            create(root.right);
        }
    }
}