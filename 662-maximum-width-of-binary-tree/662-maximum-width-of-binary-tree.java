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
public int widthOfBinaryTree(TreeNode r) {
    
        int ans = 0;
        if(r == null)return ans; 
        
        LinkedList<TreeNode> q = new LinkedList<>();
        LinkedList<Integer> indexes = new LinkedList<>();
        q.add(r);  
        indexes.add(0);  
        
      while(!q.isEmpty())
      {
          int len = q.size();
          int start = indexes.peekFirst();
          int end = indexes.peekLast();
          
          for(int i=0; i<len; i++)
          {
              TreeNode temp = q.poll();
              int index = indexes.poll();
              
              if(temp.left != null)
              {
                  q.add(temp.left);
                  indexes.add(2*index+1);
              }

             if(temp.right != null)
              {
                  q.add(temp.right);
                  indexes.add(2*index+2);
              }
          }
          
          ans = Math.max(ans , (end - start)+1);
      }
    
        return ans;
    }
}