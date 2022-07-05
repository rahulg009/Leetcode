class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]==color){
            return image;
        }
        
        int prev_color = image[sr][sc];
        
        dfs(image,sr,sc,prev_color,color);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int prev,int newe){
        if(i<image.length && i>=0 &&j<image[0].length && j>=0 && image[i][j]==prev){
            image[i][j]= newe;
            dfs(image,i+1,j,prev,newe);
            dfs(image,i-1,j,prev,newe);
            dfs(image,i,j+1,prev,newe);
            dfs(image,i,j-1,prev,newe);
        }
    }
}