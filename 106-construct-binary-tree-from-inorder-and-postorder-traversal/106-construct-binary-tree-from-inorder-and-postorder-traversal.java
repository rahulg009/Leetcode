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
   HashMap<Integer,Integer> cache;
    int ind;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ind=inorder.length-1;
        cache=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            cache.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode helper(int[] in,int[] post,int st,int en)
    {
        if(st>en || ind<0)
        {
            return null;
        }
        TreeNode root=new TreeNode(post[ind]);
        ind=ind-1;
        int index=cache.get(root.val);
        root.right=helper(in,post,index+1,en);
        root.left=helper(in,post,st,index-1);
        return root;
    }
}