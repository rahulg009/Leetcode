class Solution {
    HashMap<Integer,Integer> memo;
    public int tribonacci(int n) {
        if(n==0)return 0;
        memo = new HashMap();
        memo.put(0,0);
        memo.put(1,1);
        memo.put(2,1);
        
        return fibbo(n);
        
    }
    
    public int fibbo(int n){
        if(memo.containsKey(n))return memo.get(n);
        int res = fibbo(n-1)+fibbo(n-2)+fibbo(n-3);
        memo.put(n,res);
        return res;
    }
}