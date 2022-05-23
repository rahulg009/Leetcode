class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum_front =0;
        int sum_back=0;
        int back = cardPoints.length-1;
        int front =0;
        
        for(int i=0;i<k;i++){
            sum_front +=cardPoints[front++];
        }
        
        int max = sum_front;
        
        for(int i=0;i<k;i++){
            sum_back+=cardPoints[back--];
            sum_front -=cardPoints[--front];
            
            max = Math.max(max,sum_back+sum_front);
        }
        
        return max;
    }
}