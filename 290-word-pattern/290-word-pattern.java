class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hMap = new HashMap<>();
        HashSet<String> hSet = new HashSet<>();
        
        String[] str = s.split(" ");
        int patternLength = pattern.length();
        int strLength = str.length;
        
        if(patternLength != strLength)
            return false;
        
        for(int i = 0; i < patternLength; i++){
            if(!hMap.containsKey(pattern.charAt(i))){
                if(hSet.contains(str[i]))
                    return false;
                hMap.put(pattern.charAt(i), str[i]);
                hSet.add(str[i]);
            }
            else{
                if(!hMap.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
        }
        
        return true;
    }
}