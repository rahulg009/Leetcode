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
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> a = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        if(root==null)return arr;
        
        a.add(root);
        while(a.isEmpty()==false){
            int count = a.size();
            for(int i=0;i<count;i++){
                TreeNode curr = a.poll();
                if(i==0){
                    arr.add(curr.val);
                }
                            if(curr.right!=null){
                a.add(curr.right);
            }
            if(curr.left!=null){
                a.add(curr.left);
            }
                
            }

        }
        return arr;
        
    }
}