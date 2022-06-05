class Solution {
    static int[][] t= new int[501][501];
    public int minDistance(String word1, String word2) {
        int m = word1.length(); int n = word2.length();
        
        for(int[] x:t){
            Arrays.fill(x,-1);
        }
        
        return solve(word1,word2,m-1,n-1);
    }
    
    public int solve(String w1,String w2,int i,int j){
        
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        
        if(t[i][j]!=-1){
            return t[i][j];
        }
        
        int insert=0;int del=0;int rep=0;
        
        if(w1.charAt(i)==w2.charAt(j)){
            return solve(w1,w2,i-1,j-1);
        }else{
            insert = 1+solve(w1,w2,i,j-1);
            del = 1+solve(w1,w2,i-1,j);
            rep = 1+solve(w1,w2,i-1,j-1);
            t[i][j] = Math.min(insert,Math.min(del,rep));
            return t[i][j];
        }
        
        
    }
}