class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> hm = new HashMap<>();
        
        int prefix =0;
        
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            
            prefix%=k;
            
            if(prefix ==0 && i>0){
                return true;
            }
            
            if(hm.containsKey(prefix) && i-hm.get(prefix)>1){
                return true;
            }
            
            if(!(hm.containsKey(prefix))){
                hm.put(prefix,i);
            }
        }
        
        return false;
        
        
    }
}