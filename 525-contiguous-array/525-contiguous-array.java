class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxLen=0;
        
        mp.put(0,-1);
        int count =0;
        
        for(int i=0;i<nums.length;i++){
            
            count+= nums[i]==0?-1:1;
            if(mp.containsKey(count)){
                maxLen = Math.max(maxLen,i-mp.get(count));
            }else{
                mp.put(count,i);
            }
        }
        
        return maxLen;
    }
}