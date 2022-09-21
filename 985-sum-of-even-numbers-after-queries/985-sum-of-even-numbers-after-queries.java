class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int total =0;
        int[] store = new int[queries.length];
        
        for(int x:nums){
            if((x&1)==0){
                total+=x;
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int val = queries[i][0];
            int pos = queries[i][1];
            
            if((nums[pos]&1)==0){
                total-=nums[pos];
            }
            
            nums[pos]+=val;
            
            if((nums[pos]&1)==0){
                total+=nums[pos];
            }
            
            store[i]=total;
        }
        
        
        return store;
    }
}