class Solution {
    public int maxProduct(int[] nums) {
        int mini = nums[0];
        int maxi =nums[0];
        int ans = nums[0];
        
        for(int i=1;i<nums.length;i++){
            int first = nums[i];
            int second = maxi*nums[i];
            int third= mini*nums[i];
            
            maxi = Math.max(Math.max(first,second),third);
            mini = Math.min(Math.min(first,second),third);
            ans = Math.max(ans,maxi);
        }
        
        return ans;
        
    }
}