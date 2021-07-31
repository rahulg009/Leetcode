class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        one = sys.maxint
        two = sys.maxint
        profit1 = profit2 = 0
        
        for i in range(len(prices)):
            one = min(one, prices[i])
            profit1 = max(profit1, prices[i] - one)
            two = min(two, prices[i] - profit1)
            profit2 = max(profit2, prices[i] - two)
        
        return profit2
        