class pair{
    long a;
    long b;
    
    public pair(long a,long b){
        this.a =a;
        this.b =b;
    }
    
    public long sum(){
        return a+b;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
       PriorityQueue<pair> pq = new PriorityQueue<>((x,y)->(int)(y.sum()-x.sum()));
        
        List<List<Integer>> store = new ArrayList<>();
        
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        while(pq.size()<k &&i<n){
            if(j==m){
                i++;j=0;
                continue;
            }
            pq.add(new pair(nums1[i],nums2[j]));
            j++;
        
        }
        while(i<n){
            if(j==m){
                i++;
                j=0;
                continue;
            }
            
            if(pq.peek().sum()<=(nums1[i]+nums2[j])){
                if(j==0){
                    break;
                }
                i++;
                j=0;
                
            }else{
                pq.poll();
                pq.add(new pair(nums1[i],nums2[j]));
                j++;
                
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        while(!pq.isEmpty()){
            pair it = pq.poll();
            ans.add(Arrays.asList((int)it.a,(int)it.b));
        }
        
        return ans;
        
    }
}