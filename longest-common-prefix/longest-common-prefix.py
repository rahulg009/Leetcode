class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        index = 0 
        while (index < len(strs[0])):
            compare = strs[0][index]
            for string in strs:
                if(index>= len(string) or string[index]!=compare):
                    return string[0:index]
            index+=1
        return strs[0][0:index]
            