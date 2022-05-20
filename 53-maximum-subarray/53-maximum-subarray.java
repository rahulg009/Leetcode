class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_so_far = Integer.MIN_VALUE;
        int max_end =0;
        
        for(int i=0;i<nums.length;i++){
            max_end = max_end +nums[i];
            
            max_so_far = Math.max(max_so_far,max_end);
            
            if(max_end<0){
                max_end=0;
            }
        }
        
        return max_so_far;
        
    }
}