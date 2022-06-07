class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int count_f = 0;
        
        Queue<int[]> store = new LinkedList<>();
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    store.offer(new int[]{i,j});
                }if(grid[i][j]!=0){
                    count_f++;
                }
            }
        }
        
        if(count_f==0) return 0;
        int count_min =0; int cnt=0;
        
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{1,-1,0,0};
        
        while(!store.isEmpty()){
            int size = store.size();
            cnt+=size;
            
            for(int i=0;i<size;i++){
                int[] point = store.poll();
                for(int j=0;j<4;j++){
                    int x = point[0]+dx[j];
                    int y = point[1]+dy[j];
                    
                    if(x<0 ||y<0 || x>=m || y>=n || grid[x][y]==0 || grid[x][y]==2) continue;
                    
                    grid[x][y]=2;
                    store.offer(new int[]{x,y});
                }
            }
            
            if(store.size()!=0){
                count_min++;
            }
        }
        
        return count_f==cnt?count_min:-1;
        
    }
}