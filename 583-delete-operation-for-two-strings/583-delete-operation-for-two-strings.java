class Solution {
    static int[][] t= new int[501][501];
    public int minDistance(String word1, String word2) {
        
        int m = word1.length(); int n = word2.length();
        for(int[] x:t){
            Arrays.fill(x,-1);
        }
        
        int lcs=solve(word1,word2,m,n);
        
        return m-lcs+n-lcs;
        
        
    }
    
    public int solve(String w1,String w2,int i,int j){
        if(i==0 || j==0){
            return 0;
        }
        
        if(t[i][j]!=-1){
            return t[i][j];
        }
        
        if(w1.charAt(i-1)==w2.charAt(j-1)){
            return t[i][j]= 1+solve(w1,w2,i-1,j-1);
        }else{
            return t[i][j] = Math.max(solve(w1,w2,i,j-1),solve(w1,w2,i-1,j));
        }
    }
    
}