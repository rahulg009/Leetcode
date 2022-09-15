class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int[] ans = new int[changed.length/2];
        Queue<Integer> store = new LinkedList<>();
        int i=0;
        Arrays.sort(changed);
        
        for(int x:changed){
            if(!store.isEmpty() && store.peek()==x){
                ans[i++]= store.poll()/2;
            }else{
                store.add(x*2);
            }
        }
        
        return store.size()>0?new int[]{}:ans;
        
    }
}