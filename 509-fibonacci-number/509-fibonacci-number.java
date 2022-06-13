class Solution {
    Map<Integer,Integer> memo;
    public int fib(int n) {
        
        if(n==0)return 0;
        memo = new HashMap();
        
        return fibbo(n);
        
    }
    public int fibbo(int n){
        if(memo.containsKey(n))return memo.get(n);
        
        if(n<2) return n;
        
        memo.put(n,fibbo(n-1)+fibbo(n-2));
        
        return memo.get(n);
    }
}