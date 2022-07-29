class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> res = new ArrayList<>();
        
        for(String s:words){
            if(matches(s,pattern)==true){
                res.add(s);
            }
            
        }
        return res;
        
}

    public boolean matches(String s,String p){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char w = s.charAt(i);
            char e = p.charAt(i);
            
            if(!map1.containsKey(w)){
                map1.put(w,e);
            }
            if(!map2.containsKey(e)){
                map2.put(e,w);
            }
            
            if((w!= map2.get(e)) || (e!=map1.get(w))) return false;
        }
        
        return true;
        
    }
}