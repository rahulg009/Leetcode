class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid] > target)
            {
                right = mid - 1;
                mid = left + (right - left) / 2;
            }
            else
            {
                left = mid + 1;
                mid = left + (right - left)/2;
            }
        }
       
            return -1;
    }
}