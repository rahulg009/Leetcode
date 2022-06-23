class Solution {
    public int halveArray(int[] nums) {
        double x=0, sum=0;
        int min=0;
         PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums){
            sum+=i;
            pq.add((double)i);
        }
        
        while(sum-x>sum/2){
            double top = pq.remove();
            x+=top/2;
            pq.add(top/2);
            min++;
        }
        return min;
    }
}