class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int cn =0;
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j] == false && grid[i][j]==1){
                    cn= Math.max(cn,solve(grid,i,j,vis));
                }
            }
        }
        
        return cn;
    }
    public int solve(int[][] g,int i,int j,boolean[][] v){
        if(i<0 || j<0 || i>= g.length || j>=g[0].length || g[i][j]==0 || v[i][j])return 0;
        
        v[i][j] = true;
        
        return 1+solve(g,i+1,j,v)+solve(g,i-1,j,v)+solve(g,i,j+1,v)+solve(g,i,j-1,v);
    }
}