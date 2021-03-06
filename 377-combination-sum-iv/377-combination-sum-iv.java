class Solution {
    Integer dp[];
    int result=0;
    public int combinationSum4(int[] nums, int target) {
        dp=new Integer[target+1];
        return helper(nums,target);
    }
    public int helper(int[] nums,int sum)
    {
        if(sum==0)
        {
            return 1;
        }
        else if(sum<0)
        {
            return 0;
        }
        
        
        if(dp[sum]!=null)
        {
            return dp[sum];
        }
        else
        {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res=res+helper(nums,sum-nums[i]);
        }
        return dp[sum]=res;
        }
    }
}