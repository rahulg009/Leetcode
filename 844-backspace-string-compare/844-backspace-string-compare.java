class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        
        for(char i:s.toCharArray()){
            if(i=='#'){
                if(!s1.isEmpty()){
                    s1.pop();
                    continue;
                }
                
            }else{
                s1.push(i);
            }
            
        }
        
        for(char j:t.toCharArray()){
            if(j=='#'){
                if(!s2.isEmpty()){
                    s2.pop();
                    continue;
                }
            }else{
                s2.push(j);
            }
            
        }  
        
        
        String res1 ="";
        String res2 ="";
        
        while(!s1.isEmpty()){
            res1+= s1.pop();
        }
        while(!s2.isEmpty()){
            res2+= s2.pop();
            
        }
        
        return  res1.equals(res2);
        
        
    }
}