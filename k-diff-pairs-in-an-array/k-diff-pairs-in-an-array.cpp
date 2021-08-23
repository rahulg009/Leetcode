class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n=nums.size();
        unordered_map<int,int>m;
        int count=0;
        
        for(int i=0;i<n;i++){
            m[nums[i]]++;
        }
        
        if(k==0){
            for(auto x:m){
                if(x.second>1){
                    count++;
                }
            }
            return count;
        }
        if(k>0){
            for(auto x:m){
                if(m.count(x.first-k)){
                    count++;
                }
            }
            
        }
        return count;
        
    }
};