class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > nums[i]){
                count++;
                
                if(i - 2 >= 0 && nums[i - 2] <= nums[i]){   //[1,4,3]
                    nums[i - 1] = nums[i];
                }
                
                else if(i - 2 >= 0 && nums[i - 2] > nums[i]){    //[3,4,2]
                    nums[i] = Math.max(nums[i - 1],nums[i - 2]);
                }
            }
        }
        
        return (count <= 1) ? true : false;
    }
}