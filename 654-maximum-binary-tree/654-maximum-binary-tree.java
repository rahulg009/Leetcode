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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return solve(nums,0,nums.length-1);
        
    }
    public TreeNode solve(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        
        
        int maxIndex = findMax(nums,start,end);
        TreeNode left = solve(nums,start,maxIndex-1);
        TreeNode right = solve(nums,maxIndex+1,end);
        TreeNode node = new TreeNode(nums[maxIndex],left,right);
        return node;
        
    }
    public int findMax(int[] nums,int start,int end){
        
        int maxIdx = start;
        for(int i=start+1;i<=end;i++){
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
            
        }
        return maxIdx;
    }
}