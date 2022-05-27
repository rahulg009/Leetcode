class Solution {
    public String convertToTitle(int columnNumber) {
        
       StringBuilder sr = new StringBuilder();
        
        while(columnNumber>0){
            
            char c = (char)((columnNumber%26==0?26:columnNumber%26)+64);
            
            sr.append(c);
            
            columnNumber = (columnNumber%26==0?columnNumber/26-1:columnNumber/26);
        }
        
        return sr.reverse().toString();
        
        
    }
}