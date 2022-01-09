class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean ans[][]=new boolean[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<=matrix.length)
                {
                    ans[i][matrix[i][j]-1]=true;
                }
            }
        }
        boolean ans2[][]=new boolean[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[j][i]<=matrix.length)
                {
                    ans2[matrix[j][i]-1][i]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(ans[i][j]==false||ans2[j][i]==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}