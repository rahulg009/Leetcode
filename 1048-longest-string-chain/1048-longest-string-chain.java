class Solution {
    int ans =1;
    public int longestStrChain(String[] words) {
        HashMap<String,Integer> hmap = new HashMap();
        sort(words);
        
        for(int i=0;i<words.length;i++){
            String curr = words[i];
            
            if(!hmap.containsKey(curr)){
                hmap.put(curr,1);
            }
            
            for(int j=0;j<curr.length();j++){
                StringBuilder sb = new StringBuilder(curr);
                sb.deleteCharAt(j);
                
                String newString = sb.toString();
                
                if(hmap.containsKey(newString)){
                    hmap.put(curr,hmap.get(newString)+1);
                }
                
                ans = Math.max(ans,hmap.get(curr));
                
            }
            
        }
        
        return ans;
        
        
        
    }
    public void sort(String[] words) {
        Arrays.sort(words, (a,b)->Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length())));
    }
}