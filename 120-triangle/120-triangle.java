class Solution {
    private  Integer[][] memo;
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new Integer[n][n];
        
        return dfs(0,0,triangle);
        
    }
    private int dfs(int level,int index,List<List<Integer>> t){
        if (memo[level][index] != null) return memo[level][index];
        
        int path = t.get(level).get(index);
        if(level<t.size()-1){
            path+=Math.min(dfs(level+1,index,t),dfs(level+1,index+1,t));
        }
        
        return memo[level][index]=path;
    }
}