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
    int ans =0;
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;
        HashMap<Integer,Integer> mp = new HashMap();
        mp.put(0,1);
        helper(root,targetSum,mp,0);
        return ans;
    }
    
    public int helper(TreeNode root,int tar,HashMap<Integer,Integer> mp,int sum){
        
        sum+=root.val;
        
        if(mp.containsKey(sum-tar)){
            ans+=mp.get(sum-tar);
        }
        
        if(!mp.containsKey(sum)){
            mp.put(sum,1);
        }else{
            mp.put(sum,mp.get(sum)+1);
        }
        
        if(root.left!=null){
            helper(root.left,tar,mp,sum);
        }
        
        if(root.right!=null){
            helper(root.right,tar,mp,sum);
        }
        
        
        
        
        mp.put(sum,mp.get(sum)-1);
        
        return 0;
    }
}