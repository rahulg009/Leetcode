class Solution {
    static int[][] t = new int[201][201];
    public int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;
        t = new int [m+1][n+1];
        return helper(grid,m,n,t);
    }
    
    public int helper(int[][] g,int i,int j,int[][] t){
        if (i==0 && j==0){
            return g[0][0];
        }
        else if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(t[i][j]!=0){
            return t[i][j];
        }
        
        return t[i][j]= g[i][j] + Math.min(helper(g,i-1,j,t),helper(g,i,j-1,t));
    }
}