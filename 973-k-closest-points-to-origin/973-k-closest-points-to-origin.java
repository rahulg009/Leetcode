class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[2]-a[2]));
        
        for(int i=0; i<points.length; i++) {
            int dis = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            if(pq.size()<k)
                pq.add(new int[]{points[i][0],points[i][1],dis});
            else if(pq.peek()[2]>dis) {
                pq.remove();
                pq.add(new int[]{points[i][0],points[i][1],dis});
            }
        }
        
        int[][] res = new int[k][2];
        int i=0;
        while(!pq.isEmpty()) {
            int[] point = pq.remove();
            res[i][0] = point[0];
            res[i++][1] = point[1];
        }
        
        return res;
    }
}