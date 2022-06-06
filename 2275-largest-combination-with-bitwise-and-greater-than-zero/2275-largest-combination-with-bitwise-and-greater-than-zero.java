class Solution {
    public int largestCombination(int[] candidates) {
        
        int[] bit = new int[32];
        
        for(int i=0;i<32;i++){
            for(int e:candidates){
                if(((e>>i) & 1)==1){
                    bit[i]++;
                }
            }
        }
        
        int ans = 0;
        for(int val : bit){
            ans = Math.max(ans, val);
        }
        return ans;
    }
}