class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        arr=[0]*len(nums)
        
        for i in range(0,len(nums)):
            arr[nums[i]]+=1
            if(arr[nums[i]]==2):
                ans = nums[i]
            
        return ans
        