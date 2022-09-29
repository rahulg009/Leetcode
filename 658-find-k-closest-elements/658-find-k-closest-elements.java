class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> store = new ArrayList<>();
        
        PriorityQueue<int[]> pq= new PriorityQueue<>((e1,e2)->(e1[0]!=e2[0])?(e2[0]-e1[0]):(e2[1]-e1[1]));
        
        
        for(int xx:arr){
            pq.add(new int[]{Math.abs(xx-x),xx});
            if(pq.size()>k)pq.poll();
        }
        
        while(k-->0){
            store.add(pq.poll()[1]);
        }
        
        Collections.sort(store);
        return store;
        
    }
}