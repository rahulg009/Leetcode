class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<int[]> st = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        
        st.push(new int[]{temperatures[0],0});
        
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]<temperatures[i]){
                int[] temp = st.pop();
                int a = temp[1];
                res[a]=i-a;
            }
            st.push(new int[]{temperatures[i],i});

        }
        
        return res;
    }
}