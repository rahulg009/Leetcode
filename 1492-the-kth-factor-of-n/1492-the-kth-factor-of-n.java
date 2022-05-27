class Solution {
    public int kthFactor(int n, int k) {
        
        ArrayList<Integer> store = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                store.add(i);
            }
        }
        
        
        
        return k<=store.size()?store.get(k-1):-1;
        
    }
}