class Solution {
    public int totalSteps(int[] nums) {
        Stack<Pair<Integer,Integer>> store = new Stack<>();
        
        store.add(new Pair<>(nums[nums.length-1],0));
        int ans =0;
        
        for(int i=nums.length-2;i>=0;i--){
            int c =0;
            while(store.size()>0 && nums[i]>store.peek().getKey()){
                c = Math.max(c+1,store.peek().getValue());
                store.pop();
            }
            
            store.add(new Pair<>(nums[i],c));
            ans = Math.max(ans,c);
        }
        
        return ans;
        
    }
}