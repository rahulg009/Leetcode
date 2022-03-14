class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        if(nums ==null){
            return 0;
        }
        
        int total =0;
        for(int u:nums){
            total=total+u;
        }
        
        if(((total - target) % 2 == 1) || (target > total))
            return 0;
        
        int sum = (total-target)/2;
        return countSubsetsum(nums,sum);
        
        
    }
    
    public int countSubsetsum(int[] arr,int sum){
        int n = arr.length;
       
        int[][] t = new int[n+1][sum+1];
        
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<sum+1;j++){
        //         if(i==0){
        //             t[i][j]=0;
        //         }if(j==0){
        //             t[i][j]=1;
        //         }
        //     }
        // }
        t[0][0]=1;
        
        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j]= t[i-1][j-arr[i-1]] + t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
            return t[n][sum];
    }
}