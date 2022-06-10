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
    public List<TreeNode> generateTrees(int n) {
        
        return ans(1,n);
    }
    
    public List<TreeNode> ans(int start,int end){
        
        List<TreeNode> a = new ArrayList();
        if(start>end){
            a.add(null);
        }
        
        if(start == end){
            a.add(new TreeNode(start));
            return a;
        }
        
        List<TreeNode> left;
        List<TreeNode> right;
        
        for(int i=start;i<=end;i++){
            
            left = ans(start,i-1);
            right = ans(i+1,end);
            
            for(TreeNode l:left){
                for(TreeNode r:right){
                    
                    TreeNode res = new TreeNode(i);
                    res.left = l;
                    res.right =r;
                    
                    a.add(res);
                }
            }
        }
        
        return a;
    }
}