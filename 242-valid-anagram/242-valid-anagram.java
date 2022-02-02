class Solution {
    
    public boolean isAnagram(String s, String t) {
        
        int[] sCharCount = new int[26];
        int[] tCharCount = new int[26];
        
        for (char c : s.toCharArray()) {
            sCharCount[c - 'a'] += 1; 
        }
        
        for (char c : t.toCharArray()) {
            tCharCount[c - 'a'] += 1; 
        }
        
        return Arrays.equals(sCharCount, tCharCount);
        
    }
    
}