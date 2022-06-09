class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int sum=0;int extra=0;int start =0;
        
        for(int i=0;i<gas.length;i++){
            sum+= gas[i] - cost[i];
            extra+= gas[i] - cost[i];
            if(extra<0){
                extra=0;
                start = i+1;
            }
        }
        
        return sum>= 0?start:-1;
        
    }
}