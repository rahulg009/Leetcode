class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        
        int text = s.length();
        int pattern = p.length();
        
        for(int i=0;i<text-pattern+1;i++){
            
            String str = s.substring(i,i+pattern);
            
            if(anagram(p,str)){
                ans.add(i);
            }
        }
        return ans;
    }
    
    public boolean anagram(String a,String b){
        int[] freq = new int[26];
        
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}