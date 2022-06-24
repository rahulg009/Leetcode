class Solution {
     ArrayList<String> list = new ArrayList<>(); 
    public List<String> letterCasePermutation(String s) {
      helper(s,0,"");
      return list;
    }   
    
    public void helper(String s,int idx, String ans){
        
        if(idx == s.length()){
         list.add(new String(ans));
            return;
        }
        
        char ch = s.charAt(idx);
       
        if(!Character.isAlphabetic(ch)){
             helper(s,idx+1,ans + ch);
             return;
        }
        else{
            helper(s,idx+1,ans+Character.toUpperCase(ch));
            helper(s,idx+1,ans+Character.toLowerCase(ch));
        }
        
        
    }
}