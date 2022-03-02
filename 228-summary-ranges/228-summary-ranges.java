class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> store = new ArrayList<>();
        for (int i=0;i<nums.length;){
            int start =i;int end =i;
            
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]+1==nums[j+1]){
                    end++;
                }else{
                    break;
                }
            }
            if(start == end){
                store.add(String.valueOf(nums[start]));
                i=start+1;
            }else{
                store.add(String.valueOf(nums[start]+"->"+nums[end]));
                i=end+1;
            }
        }
        return store;
        
    }
}