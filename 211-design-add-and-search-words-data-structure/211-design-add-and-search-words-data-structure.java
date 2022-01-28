class WordDictionary {
    HashMap<Integer, List<String>> sm;

    public WordDictionary() {
        sm= new HashMap<>();
    }
    
    public void addWord(String word) {
        int len = word.length();
        if(!sm.containsKey(len)){
            sm.put(len,new ArrayList<String>());
        }
        sm.get(len).add(word);
        
    }
    public boolean avail(String word){
        int len = word.length();
        if(!sm.containsKey(len)){
            return false;
        }
        List<String> ls = sm.get(len);
        if(ls.contains(word)){
            return true;
        }
        for(String u:ls){
            if(check(u,word)){
                return true;
            }
        }
        return false;
        
    }
    public boolean check(String a,String u){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=u.charAt(i)){
                if(u.charAt(i)!='.'){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean search(String word) {
        
        return avail(word);
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */