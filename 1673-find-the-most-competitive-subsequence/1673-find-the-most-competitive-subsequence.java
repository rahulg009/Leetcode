class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        return remove(nums,nums.length-k); 
    }
    public int[] remove(int[] nums,int k){
        Stack<Integer> st = new Stack();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(st.isEmpty()){
                st.add(num);
            }else{
                while(st.size()>0 && st.peek()>num && k>0){
                    st.pop();
                    k--;
                }
                st.add(num);
            }
        }
        
        while(st.size()>0 && k>0){
            st.pop();
            k--;
        }
        
        int[] ans = new int[st.size()];
        
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        
        return ans;
    }
}