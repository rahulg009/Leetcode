class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n= nums2.length;
        
        if(n==0||m==0){
            return new int[0];
        }
        
        
        int j = n-1;
        
        Stack<Integer> stc = new Stack<Integer>();
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<m;i++){
            mp.put(nums1[i],-1);
        }
        
        stc.push(nums2[j]);
        
        for(int i=n-2;i>=0;i--){
            while(!stc.isEmpty() && stc.peek()<nums2[i]){
                stc.pop();
            }
            
            if(!stc.isEmpty()){
                if(mp.containsKey(nums2[i])){
                    mp.put(nums2[i],stc.peek());
                }
            }
            
            stc.push(nums2[i]);
        }
        
        int[] ans = new int[nums1.length];
        for(int i=0;i<m;i++){
            ans[i]=mp.get(nums1[i]);
        }
        
        return ans;
    }
}