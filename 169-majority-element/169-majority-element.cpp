class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> temp;
        int count =0,res=0;
        for(int i=0;i<nums.size();i++){
            temp[nums[i]]+=1;
            if(temp[nums[i]]>count){
                res=nums[i];
                count=temp[nums[i]];
            }
        }
        return res;
    }
};