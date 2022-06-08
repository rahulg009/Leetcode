class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return solve(0,0,m,n,memo);
        
    }
    public int solve(int r,int c,int m,int n,int[][] memo){
        if(r==m || c==n){
            return 0;
        }
        if(r==m-1 && c==n-1){
            return 1;
        }
        
        if(memo[r][c]!=0){
            return memo[r][c];
        }
        
        return memo[r][c]= solve(r+1,c,m,n,memo)+solve(r,c+1,m,n,memo);
    }
}