class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        if(len(nums)==1):
            return 0
        
        nums.sort()
        
        maxi=0
        for i in range(0,len(nums)-1):
            maxi=max(maxi,nums[i+1]-nums[i])
        
        return maxi
        