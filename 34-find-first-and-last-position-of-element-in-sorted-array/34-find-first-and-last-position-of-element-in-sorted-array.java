class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0] = firstElement(nums,target);
        ans[1] = lastElement(nums,target);
        
        return ans;
        
    }
    
    public int firstElement(int[] num,int tar){
        int idx=-1;
        int start =0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            
            if(num[mid] >=tar){
                end = mid -1;
            }else{
                start = mid+1;
            }
            
            if(num[mid] == tar){
                 idx = mid;
            }
            
            
        }
        return idx;
    }
    
    public int lastElement(int[] num,int tar){
        int idx =-1;
        int start =0;
        int end = num.length-1;
        
        while(start<=end){
            int mid = (start + end)/2;
            
            if(num[mid]<=tar){
                start = mid+1;
                
            }else{
                end = mid-1;
            }
            
            if(num[mid]==tar){
                idx = mid; 
            }
        }
        return idx;
    }
}