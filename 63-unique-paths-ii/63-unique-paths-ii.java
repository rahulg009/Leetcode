class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        
        for(int[] u:dp){
            Arrays.fill(u,-1);
        }
        
        
        return solve(obstacleGrid,dp,0,0,m-1,n-1);
    }
    
    public int solve(int[][] obstacleGrid,int[][] dp, int i,int j, int m,int n){
        if(i>m || j>n || i<0 || j<0 || obstacleGrid[i][j]==1) return 0;
        if(i==m && j==n && obstacleGrid[i][j]==0)return 1;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        return dp[i][j]=(solve(obstacleGrid,dp,i+1,j,m,n)+solve(obstacleGrid,dp,i,j+1,m,n));
    }
}