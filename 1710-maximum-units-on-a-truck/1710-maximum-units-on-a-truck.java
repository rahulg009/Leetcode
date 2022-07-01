class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans =0;
        
        for(int[] s:boxTypes){
            int measure = Math.min(s[0],truckSize);
            ans += s[1]*measure;
            truckSize -= measure;
            if(truckSize==0)return ans;
        }
        
        return ans;
    }
}