class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        
        int n = costs.length;
        int total = 0;
        
        Arrays.sort(costs,(a,b)->(a[0]-a[1]-(b[0]-b[1])));
        
        for(int i=0;i<n/2;i++){
            total+= (costs[i][0]+costs[i+n/2][1]);
        }
        
        return total;
        
    }
}