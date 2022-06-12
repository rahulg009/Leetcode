class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer> store = new HashSet();
        
        int start =0,end=0,curSum=0,max_sum=Integer.MIN_VALUE;
        
        while(end<nums.length){
            int cur = nums[end];
            if(!store.contains(cur)){
                curSum+= cur;
                max_sum = Math.max(max_sum,curSum);
                store.add(cur);
                end++;
            }else{
                int removed = nums[start];
                store.remove(removed);
                curSum-=removed;
                start++;
                
            }
        }
        
        return max_sum;
    }
}