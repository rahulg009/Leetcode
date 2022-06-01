class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> store = new HashMap<>();
        int count =0;
        int maxx=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!store.containsKey(s.charAt(j))){
                    count++;
                    store.put(s.charAt(j),1);
                    maxx = Math.max(maxx,count);
                    
                }else{
                    
                    store = new HashMap<>();
                    count=0;
                    break;
                }
            }
        }
        
        return maxx;
        
    }
}