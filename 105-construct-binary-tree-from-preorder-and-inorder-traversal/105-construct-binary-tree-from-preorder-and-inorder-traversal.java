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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return cTree(preorder,inorder,0,inorder.length-1);
        
    }
    TreeNode cTree(int[] preorder, int[] inorder,int startIndex, int endIndex)
{
    if(startIndex > endIndex) return null;
    
    TreeNode root = new TreeNode(preorder[preIndex++]);
    
    int inIndex = 0;
    
    for(int i = startIndex; i <= endIndex; i++)
    {
        if(inorder[i] == root.val)
           {
             inIndex = i;
               break;
           }

    }
    root.left = cTree(preorder,inorder,startIndex,inIndex-1);
    root.right = cTree(preorder,inorder,inIndex+1,endIndex);
    
    return root;
}
}