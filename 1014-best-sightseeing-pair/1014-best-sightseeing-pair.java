class Solution {
    public int maxScoreSightseeingPair(int[] values) { 
        int firstPair = values[0]+0;
        int ans = 0;
        for(int i=1;i<values.length;i++){
            ans = Math.max(ans,firstPair+values[i]-i);
            firstPair = Math.max(firstPair,values[i]+i);
        }
        return ans; 
    }
}