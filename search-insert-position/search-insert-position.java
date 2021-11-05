class Solution {
    public int searchInsert(int[] nums, int target) {
        int len= nums.length;
        
        if(len==0 || target<=nums[0]){
            return 0;
        }
        if(target==nums[len-1]){
            return len-1;
        }
        if(target>nums[len-1]){
            return len;
        }
        
        int l=1;
        int r=len-1;
        
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
        
    }
}