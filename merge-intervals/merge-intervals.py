class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        i=0
        
        while(i<len(intervals)-1):
            
            
            
            if(intervals[i][1]>=intervals[i+1][1]):
                intervals.remove(intervals[i+1])
                continue
            if(intervals[i][1]>=intervals[i+1][0]):
                store=intervals[i+1][1]
                intervals.remove(intervals[i+1])
                intervals[i][1]=store
                continue
            
            i+=1
        
        return intervals
        
        
        