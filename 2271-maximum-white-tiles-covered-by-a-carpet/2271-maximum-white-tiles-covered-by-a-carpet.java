class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        
        Arrays.sort(tiles,(x,y)->x[0]-y[0]);
        int currentCover = (tiles[0][1] - tiles[0][0]+1>= carpetLen? carpetLen : tiles[0][1]-tiles[0][0]+1);  
        int maxCover = currentCover;
        int head =1;
        int tail =0;
        
        while(head<tiles.length && tail<tiles.length && maxCover< carpetLen){
            
            if(tiles[head][1]-tiles[tail][0]+1<= carpetLen){
                currentCover+=tiles[head][1]-tiles[head][0]+1;
                maxCover = Math.max(maxCover,currentCover);
                ++head;
            }else{
                int partialCover = carpetLen - (tiles[head][0]-tiles[tail][0]);
                maxCover = Math.max(maxCover,currentCover+partialCover);
                currentCover-= tiles[tail][1] - tiles[tail][0]+1;
                ++tail;
            }
        }
        
        return maxCover;
        
    }
}