import java.util.*;
class Solution {
    public int longestPalindrome(String[] words) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
            
        }
        
        int flag =1;
        int ans=0;
        
        for(int i=0;i<words.length;i++){
            String rev =""+words[i].charAt(1)+words[i].charAt(0);
            
            if(map.containsKey(words[i])&& words[i].charAt(0)==words[i].charAt(1)){
                int a = map.get(words[i]);
                ans += (a/2)*4;
                a=a%2;
                if(a==1 && flag ==1){
                    flag=0;
                    ans+=2;
                }
                map.remove(words[i]);
            }
            else{
                if(map.containsKey(rev)){
                    int b = map.get(words[i]);
                    int c = map.get(rev);
                    ans+=Math.min(b,c)*4;
                    map.remove(words[i]);
                    map.remove(rev);
                }
            }
        }
        return ans;
        
    }
}