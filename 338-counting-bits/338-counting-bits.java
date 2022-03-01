class Solution {
    public int[] countBits(int n) {
        int bit[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bit[i] = Integer.bitCount(i);
        }
        return bit;
    }
}