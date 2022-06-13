class Solution {
    public static int[]memo;
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        memo = new int[n];
        
        return Math.min(solve(cost,0),solve(cost,1));
        
    }
    public int solve(int[] cost , int start){
        if(start>= cost.length)return 0;
        
        if(memo[start]!=0)return memo[start];
        
        return memo[start]= Math.min(solve(cost,start+1),solve(cost,start+2))+cost[start];
        
    }
        
        
}