class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea=0;
        
        for(int i=0;i<heights.length;i++){
            int startIndexOfCurrEle =i;
            while(!stack.isEmpty() && stack.peek()[1]>heights[i]){
                int[] removedElement = stack.pop();
                int maximumWidth = i-removedElement[0];
                maxArea = Math.max(maxArea,removedElement[1]*maximumWidth);
                startIndexOfCurrEle = removedElement[0];
            }
            stack.push(new int[]{ startIndexOfCurrEle,heights[i]});
        }
        while(!stack.isEmpty()){
            int[] removedElement = stack.pop();
            int maximumWidth = (heights.length)-removedElement[0];
            maxArea = Math.max(maxArea,removedElement[1]*maximumWidth);
        }
        
        return maxArea;
    }
}