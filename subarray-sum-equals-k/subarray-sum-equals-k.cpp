class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>m;
        m[0]=1;
        
        int ans=0;
        int current=0;
        for(int i=0;i<nums.size();i++){
            current+=nums[i];
            ans+=m[current-k];
            m[current]++;
            
        }
        return ans;
        
    }
};