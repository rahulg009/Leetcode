class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int count=1;
        int maxx=1;
        
        if(nums.length==0 || nums==null){
            return 0;
        }
       
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+1)==nums[i+1]){
                count++;
                maxx=Math.max(maxx,count);
            }
            if((nums[i]+1!=nums[i+1]) && (nums[i]!=nums[i+1])){
                count=1;
            }
        }
        
        return maxx;
        
    }
}