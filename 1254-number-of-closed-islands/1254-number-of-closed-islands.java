class Solution {
    public int closedIsland(int[][] grid) {
        
        int cn =0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && isClosed(grid,i,j)){
                    cn++;
                }
            }
        }
        
        return cn;
        
    }
    public boolean isClosed(int[][] g,int i,int j){
        if(i<0 || j<0 || i>= g.length || j>= g[0].length)return false;
        if(g[i][j]==1) return true;
        
        g[i][j]=1;
        
        boolean up = isClosed(g,i+1,j);
        boolean down = isClosed(g,i-1,j);
        boolean right = isClosed(g,i,j+1);
        boolean left = isClosed(g,i,j-1);
        
        return (up && down && right && left);
    }
}