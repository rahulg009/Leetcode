class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> res; 
        sort(nums.begin(), nums.end());
        
        for(int i=0; i<nums.size(); i++){
            if (i != 0 && nums[i] == nums[i-1]) continue; //Prevent consecutive numbers
            
            for(int j=i+1; j<nums.size(); j++){
                if (j != i+1 && nums[j] == nums[j-1]) continue;
                
                int new_target = target - nums[i] - nums[j];
                int x = j+1, y = nums.size()-1;
                while(x < y){
                    int tmp = nums[x] + nums[y];
                    if (x != j+1 && nums[x] == nums[x-1]) {
                        x++;
                        continue;
                    }
                    
                    if(tmp > new_target){
                        y--;
                    }
                    else if(tmp < new_target){
                        x++;
                    }
                    else{
                        res.push_back({nums[i], nums[j], nums[x], nums[y]});
                        x++;
                        y--;
                    }
                }
            }
        }
        return res;
    }
};