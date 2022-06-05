class Solution {
    int[][] t = new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        for(int[] x:t){
            Arrays.fill(x,-1);
        }
        char[] store = s.toCharArray();
        
        String rev ="";
        for(int i=store.length-1;i>=0;i--){
            rev+=store[i];
        }
        
        return solve(s,rev,s.length(),rev.length());
        
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