class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] charCount = new int[26];
        boolean[] charAdded = new boolean[26];
        
       for(char c:s.toCharArray()){
           charCount[c-'a']+=1;
       }
        
        
        // for(int i=0;i<s.length()-1;i++){
        //     charCount[s.charAt(i)-'a']+=1;
        // }
        StringBuilder sb = new StringBuilder();
        
        for(int i=0,j=0;i<s.length();i++){
            
            char curr = s.charAt(i);
            
            if(!charAdded[curr-'a']){
                
                while(j>0 && sb.charAt(j-1)>curr && charCount[sb.charAt(j-1)-'a']>0){
                    
                    charAdded[sb.charAt(j-1)-'a']=false;
                    sb.deleteCharAt(j-1);
                    j--;
                    
                }
                
                sb.append(curr);
                charAdded[curr-'a']=true;
                j++;
            }
            
            charCount[curr-'a']-=1;
            
            
            
            
        }
        
        return sb.toString();
        
        
        
        
        
    }
}