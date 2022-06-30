class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        int[][] dp = new int[row+1][col+1];
        int[][] res = new int[row][col];
        
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j]+mat[i][j]-dp[i][j];
            }
        }
        
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(row - 1, i + k);
                int c2 = Math.min(col - 1, j + k);
                res[i][j] = calculateSum(dp, r1, c1, r2, c2);
            }
        }
        
        return res;
        
    }
     public int calculateSum(int [][] dp, int r1, int c1, int r2, int c2) {
        return dp[r2 + 1][c2 + 1] - dp[r1][c2 + 1] - dp[r2 + 1][c1] + dp[r1][c1];
    }
    
    
}