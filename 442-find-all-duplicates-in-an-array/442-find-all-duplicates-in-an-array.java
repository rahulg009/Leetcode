class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> store = new ArrayList<>();
        
        int[] store1  =new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            store1[nums[i]]++;
        }
        
        for(int i=0;i<store1.length;i++){
            if(store1[i]==2){
                store.add(i);
            }
        }
        
        return store;
        
        
        
    }
}