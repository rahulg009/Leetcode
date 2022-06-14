class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        int used =0;
        for(int i=1;i<heights.length;i++){
            int diff = heights[i]- heights[i-1];
            
            if(diff<=0){
                continue;
            }
            pq.offer(diff);
            if(pq.size()<=ladders){
                continue;
            }
            else{
                int val = pq.remove();
                used+=val;
                if(used>bricks){
                    return i-1;
                }
            }
        }
        
        return heights.length -1;
        
    }
}