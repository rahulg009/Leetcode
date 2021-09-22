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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
                List<List<Integer>> ans = new ArrayList();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (0 < queue.size()) {
            List<Integer> temp = new ArrayList<Integer>();
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                temp.add(node.val);
            }
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
        
    }
}