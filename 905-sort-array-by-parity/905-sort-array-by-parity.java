class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int start =0;
        int end = nums.length -1;
        
        while(start <end){
            if(nums[start]%2!=0 && nums[end]%2==0){
                swap(nums,start,end);
                start++;
                end--;
            }else if(nums[start]%2==0){
                start++;
            }else if(nums[end]%2!=0){
                end--;
            }
            
            
        }
        
       
        return nums;
    }
     public void swap(int[] nums,int s,int e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
        }
}