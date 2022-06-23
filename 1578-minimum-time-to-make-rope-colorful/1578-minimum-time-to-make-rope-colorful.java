class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(colors ==null) return 0;
        int max =0;
        int total =0;
        
        for(int i=0;i<colors.length();i++){
            if(i>0 && colors.charAt(i-1)!=colors.charAt(i)){
                max=0;
            }
            total+= Math.min(max,neededTime[i]);
            max = Math.max(max,neededTime[i]);
        }
        
        return total;
    }
}