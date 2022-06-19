class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max =0;
        
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==dp.length-1){
                    dp[i][j]= Character.getNumericValue(matrix[i][j]);
                }
                else if(j==dp[0].length-1){
                    dp[i][j]= Character.getNumericValue(matrix[i][j]);
                }
                else if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                }
                else {
                    dp[i][j] = 1+ Math.min(Math.min(dp[i][j+1],dp[i+1][j+1]),dp[i+1][j]);
                }
                
                if(dp[i][j]!=0){
                    if(dp[i][j]>max){
                        max=dp[i][j];
                    }
                }
            }
        }
        
        return max*max;
        
        
    }
}