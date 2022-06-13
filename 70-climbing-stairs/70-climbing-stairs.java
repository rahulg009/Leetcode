class Solution {
    Map<Integer,Integer> hmap = new HashMap();
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        
        
        int result=0;
        if(hmap.containsKey(n-1)){
            result+=hmap.get(n-1);
        }else{
            result+= climbStairs(n-1);
        }
        
        if(hmap.containsKey(n-2)){
            result+=hmap.get(n-2);
        }else{
            result+=climbStairs(n-2);
        }
        
        
        hmap.put(n,result);
        return result;
        
        
        
        
    }
}