class Solution {
    
    public boolean canJump(int[] nums) {
        
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return solve(0,nums.length,nums,memo);
    }
    public boolean solve(int index,int len,int[] nums,int[] memo){
        if(index >= len-1)return true;
        if(nums[index]==0)return false;
        if(memo[index]!=-1)return memo[index]==1?true:false;
        for(int i=1;i<=nums[index];i++){
            if(solve(index+i,len,nums,memo)){
                memo[index]=1;
                return true;
            }
        }
        memo[index]=0;
        return false;
    }
}