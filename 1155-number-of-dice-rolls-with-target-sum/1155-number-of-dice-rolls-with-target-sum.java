class Solution {
    
    int mod = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        if(n<=0 ||k<=0||target<=0){
            return 0;
        }
        
        int [][] t = new int[n+1][target+1];
        
        for(int []o:t){
            Arrays.fill(o,-1);
        }
        return solve(t,n,k,target);
    }
    public int solve(int[][] dp,int n,int k,int t){
        if(n==1 && t<=k){
            return 1;
        }
        
        if(dp[n][t]!=-1){
            return dp[n][t];
        }
        
        long nD =0;
        
        for(int i=1;i<=Math.min(t,k);i++){
            if(t>i && n>1){
                nD+= solve(dp,n-1,k,t-i);
            }
            
        }
        return dp[n][t]=(int)(nD%mod);
    }
}