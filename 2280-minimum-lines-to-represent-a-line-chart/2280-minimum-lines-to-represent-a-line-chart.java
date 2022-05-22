class Solution {
    public int minimumLines(int[][] stockPrices) {
        
        int result =0;
        
        Arrays.sort(stockPrices,(a,b)->a[0]-b[0]);
        
        long diff_x=0;
        long diff_y =0;
        
        long prev_x=0;
        long prev_y=0;
        
        for(int i=1;i<stockPrices.length;i++){
            diff_x = stockPrices[i][0]-stockPrices[i-1][0];
            diff_y = stockPrices[i][1]-stockPrices[i-1][1];
            
            if(i>1 && diff_x *prev_y==diff_y*prev_x){
                continue;
            }
            
            result++;
            prev_x=diff_x;
            prev_y=diff_y;
            
        }
        
        return result;
        
    }
}