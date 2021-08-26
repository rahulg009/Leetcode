class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int product =1;
        int temp=1;
        int zeros=0;
        
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                zeros++;
            }
            else{
                product*=nums[i];
            }
        }
        if(zeros>1){
            product=0;
        }if(zeros==1){
            temp=0;
        }else{
            temp=product;
        }
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
                nums[i]=temp/nums[i];
            }else{
                nums[i]=product;
            }
        }
        return nums;
        
            
        
    }
};