class Solution {
    int[][] dp = new int[10001][13];
    public int coinChange(int[] coins, int amount) {
        
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        
        int ans = solvememo(coins,amount,coins.length);
        
        if(ans==Integer.MAX_VALUE-1){
            return -1;
        }
        
        return ans;
        
    }
    
    public int solvememo(int[] coi,int amt,int n){
        
        if(amt ==0 || n==0){
            return amt ==0?0:Integer.MAX_VALUE-1;
        }
        
        if(dp[amt][n]!=-1){
            return dp[amt][n];
        }
        
        if(coi[n-1]>amt){
            return dp[amt][n] = solvememo(coi,amt,n-1);
        }
        
        return dp[amt][n] = Math.min(solvememo(coi,amt,n-1),1+solvememo(coi,amt-coi[n-1],n));
    }
}