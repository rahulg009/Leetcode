class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Set<String> hset = new HashSet();
        int n = s.length();
        boolean[] dp = new boolean[n];
        
        
        for(String u:wordDict){
            hset.add(u);
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                String word = s.substring(j,i+1);
                if(hset.contains(word)){
                    if(j==0 || dp[j-1]){
                        dp[i] = true;
                    }
                }
            }
        }
        
        return dp[n-1];
    }
}