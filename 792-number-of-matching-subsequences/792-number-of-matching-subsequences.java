class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        Map<String,Integer> mp = new HashMap<>();
        
        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        int ans =0;
        
        char[] cha= s.toCharArray();
        
        for(String w:mp.keySet()){
            char[] temp = w.toCharArray();
            int i=0;
            int j=0;
            
            
            while(i<cha.length && j<temp.length){
                if(cha[i]==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            
            if(j==temp.length){
                ans += mp.get(w);
            }
        }
        
        return ans;
    }
}