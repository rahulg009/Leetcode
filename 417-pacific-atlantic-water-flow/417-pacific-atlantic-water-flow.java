class Solution {
    int p =0,a=0;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> store = new ArrayList<>();
        
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                a=0;
                p=0;
                List<Integer> storee = new ArrayList<>();
                if(possible(heights,i,j)){
                    storee.add(i);
                    storee.add(j);
                    store.add(storee);
                }
            }
        }
        
        return store;
    }
    
    public boolean possible(int[][] heights,int i,int j){
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length || heights[i][j]==-1){
         
            return false;
        }
        
        if((i>=0 && j==0) || (i==0 && j>=0)){
            p=1;
        }
        if((i>=0 && j==heights[0].length-1) || (j>=0 && i==heights.length-1)){
            a=1;
        }
        if(a==1 && p==1){
            return true;
        }
        boolean left = false,right =false,up=false,down=false;
        int temp = heights[i][j];
        heights[i][j]=-1;
        
        if(i>=1 && temp>=heights[i-1][j]){
            left = possible(heights,i-1,j);
        }
        
        if(i<=heights.length-2 && temp>=heights[i+1][j]){
            right = possible(heights,i+1,j);
        }
        
        if(j>=1 && temp>=heights[i][j-1]){
            up = possible(heights,i,j-1);
        }
        if(j<=heights[0].length-2 && temp>=heights[i][j+1]){
            down = possible(heights,i,j+1);
        }
        heights[i][j] = temp;
        
        return left||right||up||down;
    }
}