class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int ans =0;
        int[] store = new int[capacity.length];
        
        for(int i=0;i<capacity.length;i++){
            store[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(store);
        for(int i=0;i<store.length;i++){
            if(store[i]==0) ans++;
            else if(additionalRocks>=store[i]){
                additionalRocks -=store[i];
                store[i]=0;
                ans++;
            }else if(store[i]>additionalRocks){
                store[i]-= additionalRocks;
                additionalRocks=0;
            }
        }
        return ans;
    }
}