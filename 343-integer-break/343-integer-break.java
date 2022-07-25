class Solution {
    public int integerBreak(int n) {
        return dfs(n, 1, 0);
    }
    
    HashMap<String, Integer> memo = new HashMap<>();
    public int dfs(int n, int prod, int curr) {
        if (curr == n) {
            return prod;
        }
        if (curr > n) return 0;
        String key = "" + prod + ","+curr;
        if (memo.containsKey(key)) return memo.get(key);
        
        int pro = Integer.MIN_VALUE;
        for (int i = 1; i <= Math.ceil(n/2.0); i++) {
            pro = Math.max(pro, dfs(n, prod*i, curr + i));
        }
        memo.put(key, pro);
        return pro;
    }
}