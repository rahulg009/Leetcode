class Solution {
    public int concatenatedBinary(int n) {
        long k = 0;
        
        for(int i = 1;i<=n;i++){
            long x = Long.toBinaryString(i).length();
            k=k<<x;
            k=(k+i)%1000000007;
        }
        
        return (int)(k%1000000007);
    }
}