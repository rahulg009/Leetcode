class Solution {
    public int nthUglyNumber(int n) {
        
        PriorityQueue<Long> pq = new PriorityQueue();
        HashMap<Long,Boolean> hmap = new HashMap();
        
        pq.offer((long)1);
        hmap.put((long)1,true);
        
        
        long ans =0;
        
        for(int i=0;i<n;i++){
            ans = pq.poll();
            
            if(hmap.containsKey(ans*2)==false){
                pq.offer(ans*2);
                hmap.put(ans*2,true);
            }
            if(hmap.containsKey(ans*3)==false){
                pq.offer(ans*3);
                hmap.put(ans*3,true);
            }
            if(hmap.containsKey(ans*5)==false){
                pq.offer(ans*5);
                hmap.put(ans*5,true);
            }
        }
        
        return (int) ans;
        
    }
}