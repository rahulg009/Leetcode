class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> store = new HashMap<>();
        
        for(int i:nums){
            store.put(i,store.getOrDefault(i,0)+1);
        }
        
        
        PriorityQueue<Integer> store2 = new PriorityQueue<>((a,b)->store.get(b)-store.get(a));
        
        for(int keys: store.keySet()){
            store2.add(keys);
        }
        
        int[] res = new int[k];
        
        for(int i=0;i<k;i++){
            res[i]=store2.poll();
        }
        
        return res;
    }
}