class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] csum = new int[nums.length];
        
        csum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            csum[i]=nums[i]+csum[i-1];
        }
        
        return csum;
    }
}