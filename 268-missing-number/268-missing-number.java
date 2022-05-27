class Solution {
    public int missingNumber(int[] nums) {
        int ans =0;
        Arrays.sort(nums);
        
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
            
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                continue;
            }else{
                 ans = nums[i]+1;
                break;
            }
        }
        
        return ans;
        
    }
}