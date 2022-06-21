class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int mini = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        
        for(int[] u:dp){
            Arrays.fill(u,-1);
        }
        
        for(int j=0;j<n;j++){
            mini = Math.min(mini,solve(matrix,dp,0,j));
        }
        
        return mini;
    }
    
    public int solve(int[][] matrix,int[][] dp,int i,int j){
        if(j<0 || j>=matrix[0].length){
            return (int)1e8;
        }
        
        if(i==matrix.length-1){
            return matrix[i][j];
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
         int leftDown=solve(matrix,dp,i+1,j-1)+matrix[i][j];
         int straightDown=solve(matrix,dp,i+1,j)+matrix[i][j];
         int rightDown=solve(matrix,dp,i+1,j+1)+matrix[i][j];
        
         return dp[i][j]=Math.min(leftDown,Math.min(straightDown,rightDown));
        
    }
}