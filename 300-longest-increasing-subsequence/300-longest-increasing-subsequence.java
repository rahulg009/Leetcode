class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int ans =1;
        
        int[] t =new int[nums.length];
        Arrays.fill(t,1);
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    t[i]= Math.max(t[i],1+t[j]);
                }
            }
            
            ans = Math.max(ans,t[i]);
        }
        
        return ans;
        
        
    }
}