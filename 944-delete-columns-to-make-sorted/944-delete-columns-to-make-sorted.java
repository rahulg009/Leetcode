class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        
        int m = strs[0].length();
        int count =0;
        
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                char q = strs[j].charAt(i);
                
                if(j+1<n){
                    char w = strs[j+1].charAt(i);
                
                if(q-w>0){
                    count++;
                    break;
                    
                }
                    
                }
                
                
            }
        }
        return count;
         
        }
        
    }
