class Solution {
    public int maxArea(int[] height) {
        int ans =0;
        int i=0;
        int j = height.length-1;
        int temp=0;
        while(i<j){
            if(height[i]<height[j]){
                temp = (j-i)*height[i];
                ans  = Math.max(temp,ans);
                i++;
            }else{
                temp=(j-i)*height[j];
                ans = Math.max(temp,ans);
                j--;
            }
        }
        return ans;
        
        
    }
}