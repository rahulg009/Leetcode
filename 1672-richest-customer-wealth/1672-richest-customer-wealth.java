class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        int len = accounts.length;
        int sum=0;
        
        for(int i=0;i<len;i++){
            for(int u:accounts[i]){
                sum=sum+u;
            }
            int ans = Math.max(sum,max);
            if(ans>max){
                max=ans;
            }
            sum=0;
        }
        return max;
    }
}