class Solution {
    int m, n;
    long[][][] dp;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        this.m = m;
        this.n = n;
        if(maxMove == 0)
            return 0;
        dp = new long[51][51][51];
        for(long[][] grid : dp) for(long[] row : grid) Arrays.fill(row, -1);
        return (int)kickTheBall(startRow, startColumn, maxMove);
    }
    private long kickTheBall(int row, int col, int goal) {
        if(row < 0 || col < 0 || row >= m || col >= n)
            return 1;
        if(goal == 0)
            return 0;
        if(dp[row][col][goal] != -1)
            return dp[row][col][goal];
        return dp[row][col][goal] = (kickTheBall(row - 1, col, goal - 1) + kickTheBall(row, col - 1, goal - 1) + kickTheBall(row + 1, col, goal - 1) + kickTheBall(row, col + 1, goal - 1)) % (long)(1e9 + 7);
    }
}