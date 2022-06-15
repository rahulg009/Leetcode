class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        for(String s : strs){
            
            int zeros = countZeros(s);
            int ones = countOnes(s);
            
            for(int i=m;i>=zeros;i--){
                for(int j=n;j>=ones;j--){
                    dp[i][j] = Math.max(dp[i][j],1+dp[i-zeros][j-ones]);
                }
            }
        }
        
        return dp[m][n];
    }
    
 public int countZeros(String str){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '0'){
            count++;
        } 
    }
    return count;
}
public int countOnes(String str){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '1'){
            count++;
        }
    }
    return count;
}

}