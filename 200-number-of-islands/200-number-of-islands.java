class Solution {
    public int numIslands(char[][] grid) {
        int cn =0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    dfs(grid,i,j,vis);
                    cn++;
                }
            }
        }
        return cn;
    }
    public void dfs(char[][] grid,int i,int j,boolean[][] v){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]=='0'|| v[i][j]==true)return ;
        
        v[i][j]=true;
        dfs(grid,i+1,j,v);
        dfs(grid,i-1,j,v);
        dfs(grid,i,j+1,v);
        dfs(grid,i,j-1,v);
        return;
        
    }
}