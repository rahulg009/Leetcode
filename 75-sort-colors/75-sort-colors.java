class Solution {
    public void sortColors(int[] nums) {
        
        int one =0;
        int two =0;
        int zero =0;
        
        for(int i:nums){
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            }else if(i==2){
                two++;
            }
        }
        
        int ans =0;
        
        while(zero>0){
            nums[ans++]=0;
            zero--;
        }
        while(one>0){
            nums[ans++]=1;
            one--;
        }
        while(two>0){
            nums[ans++]=2;
            two--;
        }
        
        
    }
}