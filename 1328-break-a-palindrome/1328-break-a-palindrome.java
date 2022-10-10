class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==0 || palindrome.length()==1) return "";
        
        char[] ch = palindrome.toCharArray();
        
        for(int i=0;i<palindrome.length();i++){
            if(ch[i]!='a'){
                char temp = ch[i];
                
                ch[i]='a';
                
                if(isPal(new String(ch))==false) return new String(ch);
                else ch[i]=temp;
                
            }
        }
        
        ch[ch.length-1]='b';
        
        
        return new String(ch);
    }
    
    public static boolean isPal(String pal){
        
        int start =0;
        int end = pal.length()-1;
        
        while(start < end){
            if(pal.charAt(start)!=pal.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
        
    }
}