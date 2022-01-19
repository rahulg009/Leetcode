class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList();
        int j=0;
        for(int i=1;i<=n && i<=target[target.length-1];i++){
            if(target[j]!=i){
                ans.add("Push");
                ans.add("Pop");
                
            }
            else{
                ans.add("Push");
                j++;
            }
        }
        return ans;
        
    }
}