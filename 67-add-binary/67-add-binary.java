import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger aa = new BigInteger(a,2);
        BigInteger bb = new BigInteger(b,2);
        BigInteger ans = aa.add(bb);
        
        String anss = ans.toString(2);
        
        return anss;
        
       
    }
}