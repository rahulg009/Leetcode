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
    List<List<Integer>> store = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root!=null) solve(root,targetSum,0,new ArrayList<>());
        return store;
    }
    public void solve(TreeNode root,int target,int cur,List<Integer> curlist){
        cur+=root.val;
        curlist.add(root.val);
        
        if(root.left==null && root.right==null && cur==target)store.add(curlist);
        if(root.left!=null)solve(root.left,target,cur,new ArrayList<>(curlist));
        if(root.right!=null)solve(root.right,target,cur,new ArrayList<>(curlist));
    }
}