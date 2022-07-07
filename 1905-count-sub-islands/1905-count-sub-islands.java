class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        
        int c =0;
        
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    if(solve(grid1,grid2,i,j)){
                        c++;
                    }
                }
            }
        }
        
        return c;
        
    }
    public boolean solve(int[][] a,int[][] b ,int i,int j){
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || b[i][j]==0)return true;
        if(a[i][j]!=b[i][j]) return false;
        
        
        a[i][j]=0;
        b[i][j]=0;
        boolean up = solve(a,b,i+1,j);
        boolean down = solve(a,b,i-1,j);
        boolean left = solve(a,b,i,j+1);
        boolean right = solve(a,b,i,j-1);
        
        return (up&&down&&left&&right);
    }
}