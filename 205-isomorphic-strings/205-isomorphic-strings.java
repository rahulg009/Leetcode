class Solution {
   public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Character> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(charMap.containsKey(s.charAt(i))){
                if(charMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(charMap.containsValue(t.charAt(i))) return false;
                charMap.put(s.charAt(i),t.charAt(i));
            }
        }
        
        return true;
    }
}