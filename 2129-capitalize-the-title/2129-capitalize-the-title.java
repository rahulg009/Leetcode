import java.util.*;
class Solution {
    public String capitalizeTitle(String title) {
        
        int n = title.length();
        
        String words[] = title.split("\\s");
        String finalWord="";
        
        for(String s: words){
            int w = s.length();
            String first = s.substring(0,1);
            String second = s.substring(1);
            if(w>2){
                finalWord+=first.toUpperCase()+second.toLowerCase()+" ";
            }else{
                finalWord+=s.toLowerCase()+" ";
            }
            
            
            
        }
        return finalWord.substring(0,n);
        
    }
}