public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z==x+y || z==x || z==y || z==0)
            return true;
        if (x==0 || y==0 || z>x+y || z%gcd(x, y)!= 0)
            return false;
        return true;
    }
    private int gcd(int a, int b){
        return b == 0? a : gcd(b, a%b);
    }
}