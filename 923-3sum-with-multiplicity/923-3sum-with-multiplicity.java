class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        long count =0;
        long mod = 1000000007;
        for(int i=0;i<n;i++){
            int new_target = target - arr[i];
            int start = i+1;
            int end = n;
            
            HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
             for(int j= start;j<end;j++){
                 
                 if(store.get(new_target-arr[j])!=null){
                     count+=store.get(new_target-arr[j]);
                 }
                 if(store.get(arr[j])!=null){
                     store.put(arr[j],store.get(arr[j])+1);
                 }else{
                     store.put(arr[j],1);
                 }
                
             }
        }
        
        return (int)(count%mod);
    }
}