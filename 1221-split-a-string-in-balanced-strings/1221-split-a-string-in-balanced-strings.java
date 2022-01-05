class Solution {
    public int balancedStringSplit(String s) {
        
        char[] ch = s.toCharArray();
        int res=0;
        int count=0;
        int icr=0;
        
        for(char c:ch){
            if(c=='L'){
                icr++;
                
            }else{
                icr--;
            }
            if(icr==0){
                count++;
            }
        }
        return count;
        
        
        
        
    }
}