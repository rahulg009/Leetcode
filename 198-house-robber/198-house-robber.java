class Solution {
    public int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return solve(nums,0);
    }
    public int solve(int[] nums,int index){
        if(index>=nums.length){
            return 0;
        }
        if(memo[index]!=-1){
            return memo[index];
        }
        
        return memo[index]= Math.max(nums[index]+solve(nums,index+2),solve(nums,index+1));
    }
}