class Solution {
    public int removeElement(int[] nums, int val) {
        int other =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[other]=nums[i];
                other++;
            }
        }
        return other;
    }
}