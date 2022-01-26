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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> store = new ArrayList<>();
        
        solve1(store,root1);
        solve1(store,root2);
        Collections.sort(store);
        return store;
        
    }
    public void solve1(List<Integer> ans,TreeNode root){
        if(root!=null){
            solve1(ans,root.left);
            ans.add(root.val);
            solve1(ans,root.right);
        }
    }
}