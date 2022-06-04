class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count =0;
        int maxx=0;
        for(int x:nums){
            if(x==1){
                count++;
                maxx = Math.max(count,maxx);
            }else{
                count=0;
            }
        }
        
        return maxx;
        
    }
}