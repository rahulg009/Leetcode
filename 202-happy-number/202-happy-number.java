class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            n = sumOfSquares(n);
            
            if(n==1) return true;
        }
        return false;
    }
    
    public int sumOfSquares(int n){
        int ans =0;
        while(n!=0){
             ans += (n%10) *(n%10);
            n=n/10;
        }
        return ans;
    }
}