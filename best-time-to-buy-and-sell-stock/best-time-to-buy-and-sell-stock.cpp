class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini = prices[0];
        int profit=0;
        for(auto i=1;i<prices.size();i++){
            profit = std::max(profit,prices[i]-mini);
            mini= std::min(prices[i],mini);
        }
        return profit;
    }
};