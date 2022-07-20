class Solution {
    public int kInversePairs(int n, int k) {
        long mod = (long)1e9+7;
        long dp[][] = new long[n+1][k+1];
        
        for(int curr_n=0;curr_n<=n;curr_n++){
            for(int curr_k=0;curr_k<=k;curr_k++){
                if(curr_n==0||curr_k>(curr_n*(curr_n-1)/2)) continue;
                else if(curr_k==0||curr_k==(curr_n*(curr_n-1)/2)) dp[curr_n][curr_k] = 1;
                else{
                    long ans = ((dp[curr_n][curr_k-1]%mod)+(dp[curr_n-1][curr_k]%mod))%mod;
                    if(curr_k>=curr_n) ans = ((ans%mod)-(dp[curr_n-1][curr_k-curr_n]%mod))%mod;
                    
                    dp[curr_n][curr_k] = ans;
                }
            }
        }
        
        long ans = dp[n][k];
        int finalAns = (int)(ans%mod);
        if(finalAns<0) finalAns+=(int)mod;
        return finalAns;
    }
}