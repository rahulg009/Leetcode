class Solution {
    int[][] t = new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        
        for(int[] x:t){
            Arrays.fill(x,-1);
        }
        
        return solve(text1,text2,text1.length(),text2.length());
        
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