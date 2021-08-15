class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        d={}
        
        for word in  words:
            if word not in d:
                d[word]=1
            else:
                d[word]+=1
        
        ans= sorted(d,key= lambda x:(-d[x],x))
        

        return ans[:k]