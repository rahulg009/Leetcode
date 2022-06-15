class Solution {
    int[] memo;
    public int deleteAndEarn(int[] nums) {
        int max =0;
        for(int i:nums){
            max = Math.max(max,i);
        }
        int[] freq = new int[max+1];
        for(int x:nums){
            freq[x]=freq[x]+1;
        }
        memo = new int[max+1];
        Arrays.fill(memo,-1);
        return solve(freq,0);
    }
    public int solve(int[] freq,int n){
        if(n>=freq.length)return 0;
        if(memo[n]!=-1) return memo[n];
        return memo[n]= Math.max(n*freq[n]+solve(freq,n+2),solve(freq,n+1));
    }
}