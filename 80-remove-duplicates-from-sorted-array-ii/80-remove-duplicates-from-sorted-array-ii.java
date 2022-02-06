class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> store = new HashMap<>();
        
        int count =0;
        
        for(int i=0;i<nums.length;i++){
            if(store.containsKey(nums[i])){
                store.put(nums[i],store.get(nums[i])+1);
                
                if(store.get(nums[i])>2){
                    nums[i]=Integer.MAX_VALUE;
                    count++;
                }
            }else{
                store.put(nums[i],1);
            }
        }
        
        Arrays.sort(nums);
        return nums.length-count;
        
        
        
    }
}