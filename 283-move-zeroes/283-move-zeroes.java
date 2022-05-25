class Solution {
    public void moveZeroes(int[] nums) {
        
        int curr_idx=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[curr_idx] = nums[i];
                curr_idx++;
            }
        }
        
        for(int i=curr_idx;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}