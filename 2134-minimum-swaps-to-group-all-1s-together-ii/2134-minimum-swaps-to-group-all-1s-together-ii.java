class Solution {
    public int minSwaps(int[] nums) {
        
        
        int N = nums.length;
        int oneCount = 0;
        
        
        for(int ne:nums){
            if(ne==1){
                oneCount++;
            }
        }
        
        int start=0;
        int end=oneCount;
        int swapReq=0;
        int minSwap = Integer.MAX_VALUE;
        
        for(int i=start;i<end;i++){
            if(nums[i]==0){
                swapReq++;
            }
        }
        
        if(swapReq==0) {
            return 0;
        }
        
        while(end<2*N){
            
            if(nums[start%N]==0){
                swapReq--;
            }
            start++;
            
            if(nums[end%N]==0){
                swapReq++;
            }
            end++;
            
            minSwap = Math.min(minSwap,swapReq);
            if(minSwap==0) return 0;
        
        }
        return minSwap;
    }
}