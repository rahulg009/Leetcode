class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0 || intervals == null) return 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int end = intervals[0][1];
        int cnt =0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                cnt++;
                end=Math.min(intervals[i][1],end);
            }else{
                end=intervals[i][1];
            }
        }
        return cnt;
    }
}