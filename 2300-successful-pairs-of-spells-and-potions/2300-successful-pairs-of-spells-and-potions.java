class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++){
            
            int val = spells[i]; int ans =0;int n =potions.length;
            int start =0,end = n-1;
            
            while(start<=end){
                int mid = start + (end - start)/2;
                
                if((long)val*potions[mid]>=success){
                    end =mid-1;
                    ans = Math.max(ans,n-mid);
                }else{
                    start = mid+1;
                    
                }
            }
            
            spells[i]=ans;
        }
        
        return spells;
    }
}