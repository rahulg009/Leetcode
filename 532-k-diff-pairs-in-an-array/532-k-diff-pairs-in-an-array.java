class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        
        HashMap<Integer,Integer> store = new HashMap<>();
        
        for(int u:nums){
            if(store.containsKey(u)){
                store.put(u,store.getOrDefault(u,0)+1);
            }else{
                store.put(u,1);
            }
                
        }
        
        for(Integer v: store.keySet()){
            if(k>0 && store.containsKey(k+v)){
                count++;
            }
            else if(k==0 && store.get(v)>1){
                count++;
            }
        }
        return count;
        
    }
}