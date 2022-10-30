class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length,n= grid[0].length;
        boolean [][][] visited = new boolean[m][n][k+1];
        Queue<int[]> store = new LinkedList<>();
        store.add(new int[]{0,0,k});
    int res =0;
        while(store.size()>0){
            int s = store.size();
            
            while(s-->0){
                int[] rem = store.remove();
                int x = rem[0];
                int y = rem[1];
                int obs = rem[2];
                
                
                if(obs>=0 && x==m-1 && y==n-1)return res;
                
                if(obs < 0 || visited[x][y][obs] ==true)continue;
                
                visited[x][y][obs]= true;
                
                if(x-1>=0){
                    store.add(new int[]{x-1,y,obs-grid[x-1][y]});
                }
                
                if(x+1<m){
                    store.add(new int[]{x+1,y,obs-grid[x+1][y]});
                }
                
                if(y-1>=0){
                    store.add(new int[]{x,y-1,obs-grid[x][y-1]});
                }
                
                if(y+1<n){
                    store.add(new int[]{x,y+1,obs-grid[x][y+1]});
                }
                
            }
            res++;
        }
    
    return -1;
        
    }
}