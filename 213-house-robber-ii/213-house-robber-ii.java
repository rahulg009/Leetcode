class Solution {
    int[][] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        memo = new int[n][n];
        for(int[] x:memo){
            Arrays.fill(x,-1);
        }
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    public int solve(int[] nums,int start,int end){
        if(start>end) return 0;
        
        if(memo[start][end]!=-1) return memo[start][end];
        
        return memo[start][end] = Math.max(nums[start]+solve(nums,start+2,end),solve(nums,start+1,end));
    }
}