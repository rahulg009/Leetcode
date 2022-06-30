class NumMatrix {
    int sums[][];

    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        m++;
        n++;
        sums=new int[m][n];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                sums[i][j]=sums[i-1][j]+sums[i][j-1]+matrix[i-1][j-1]-sums[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       int s=sums[row2+1][col2+1];
        if(row1>0)s-=sums[row1][col2+1];
        if(col1>0)s-=sums[row2+1][col1];
        if(row1>0 && col1>0)s+=sums[row1][col1];
        return s;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */