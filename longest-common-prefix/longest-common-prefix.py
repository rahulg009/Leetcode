class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs)==1:
            return strs[0]
        
        word0=strs[0]
        for word in strs[1:]:
            temp=""
            for i in range(min(len(word),len(word0))):
                if(word[i]==word0[i]):
                    temp+=word0[i]
                else:
                    break
            word0=temp
        return word0
            