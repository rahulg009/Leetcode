class Solution {
     public int deleteAndEarn(int[] nums) {
        int inc=0;
        int exe=0;
        
        int[] arr= new int[10001];
        for(int count: nums)arr[count]++;
        
        for(int i=0;i<=10000;i++){
            int ni=exe+arr[i]*i;
            int ne=Math.max(inc,exe);
            
            inc=ni;
            exe=ne;
        }
        return Math.max(inc,exe);
    }
}
