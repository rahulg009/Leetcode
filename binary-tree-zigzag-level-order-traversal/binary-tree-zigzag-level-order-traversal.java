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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        List<List<Integer>> arr = new ArrayList<>();
        
        
        
        if(root==null){
            return arr;
        }
        store.add(root);
        boolean response = false;
        while(store.isEmpty()==false){
            List<Integer> arr1 = new ArrayList<>();
            int count = store.size();
            for(int i=0;i<count;i++){
                TreeNode curr = store.poll();
                if(response){
                    st.push(curr.val);
                }else{
                    arr1.add(curr.val);
                }
                if(curr.left!=null){
                    store.add(curr.left);
                }
                if(curr.right!=null){
                    store.add(curr.right);
                }
            }
            if(response){
                while(st.isEmpty()==false){
                    
                    arr1.add(st.pop());
                }
            }
            response=!response;
            arr.add(arr1);
        }
        return arr;
    }
}