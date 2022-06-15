class Solution {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return solve(0,nums.length,nums,memo);
    }
    
    public int solve(int index,int len,int[] nums,int[] memo){
        if(index == len-1)return 0;
        if(memo[index]!=-1)return memo[index];
        int temp =nums.length;
        for(int i=1;i<=nums[index];i++){
            if(index+i>nums.length-1){
                break;
            }
            temp = Math.min(temp,1+solve(index+i,len,nums,memo));
        }
        memo[index]=temp;
        return temp;
    }
}