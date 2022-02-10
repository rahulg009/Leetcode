class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> store = new HashMap<>();
        
        int count =0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(sum==k){
                count++;
            }
            if(store.containsKey(sum-k)){
                count+=store.get(sum-k);
            }
            store.put(sum,store.getOrDefault(sum,0)+1);
        }
        
        
        
        return count;
        
    }
}