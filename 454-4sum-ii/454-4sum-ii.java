class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int a:nums1){
            for(int b:nums2){
                int sum1 = a+b;
                mp.put(sum1,mp.getOrDefault(sum1,0)+1);
            }
        }
        int count=0;
        for(int c:nums3){
            for(int d:nums4){
                int sum2 = c+d;
                if(mp.containsKey(-sum2)){
                    count+= mp.get(-sum2);
                }
            }
        }
        return count;
    }
}