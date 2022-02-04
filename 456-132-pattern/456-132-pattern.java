class Solution {
    public boolean find132pattern(int[] nums) {
        
        int[] mini = new int [nums.length];
        
        mini[0]= nums[0];
        
        for(int i=1;i<nums.length;i++){
            mini[i]=Math.min(nums[i],mini[i-1]);
        }
        Stack<Integer> st= new Stack<>();
        
        for(int j=nums.length-1;j>=0;j--){
            
            while(st.size()>0 && st.peek()<=mini[j]){
                st.pop();
            }
            if(st.size()>0 && st.peek()<nums[j]){
                return true;
            }
            st.push(nums[j]);
        }
        return false;
    }
}