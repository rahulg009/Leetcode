class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        word=[]
        for i in s:
            if i.isalnum():
                word.append(i)
        return word == word[::-1]
    
    
    
                