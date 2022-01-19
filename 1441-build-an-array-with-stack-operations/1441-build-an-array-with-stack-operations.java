class Solution {
 public List<String> buildArray(int[] target, int n) {
        
        List<String> result = new ArrayList<>();
        n = 1;
        
        for (int i=0; i<target.length; i++) {
             
            if (target[i] != n) {
                addOperation(result, target[i] - n);
            }
            
            result.add("Push");
            n = target[i]+1;
        }
        
        return result;
    }
    
    private void addOperation(List<String> result, int n) {
        for (int i=0; i<n; i++) {
            result.add("Push");
            result.add("Pop");
        }
    }
}