class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int near =Integer.MAX_VALUE;
        int res =0;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            int tar = target - nums[i];
            int l = i+1;
            int r = n-1;
            
            while(l<r){
                int cur = nums[l]+nums[r];
                
                if(near>Math.abs(target-(nums[i]+cur))){
                    res = nums[i]+nums[l]+nums[r];
                    near = Math.abs(target-(nums[i]+cur));
                }
                if(cur == tar){
                    return target;
                }
                
                if(cur>tar){
                    r--;
                }else{
                    l++;
                }
            }
        }
        
        return res;
        
    }
}