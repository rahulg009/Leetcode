class Solution 
{
    Boolean dp[][];
    int n1, n2, n3;
    public boolean solve(String s1, int i, String s2, int j, String s3)
    {
        if(i == n1 && j == n2)
            return true;
        
        if(dp[i][j] != null)
            return dp[i][j];
        
        if(i < n1 && s1.charAt(i) == s3.charAt(i + j))
            if(solve(s1, i + 1, s2, j, s3))
				return dp[i][j] =  true;
        
        if(j < n2 && s2.charAt(j) == s3.charAt(i + j))
            if(solve(s1, i, s2, j + 1, s3))
				return dp[i][j] = true;
        
        return dp[i][j] = false;
        
    }
    public boolean isInterleave(String s1, String s2, String s3) 
    {
        n1 = s1.length(); n2 = s2.length(); n3 = s3.length();
        
        if((n1 + n2 ) != n3)
            return false;
        
        dp = new Boolean[n1 + 1][n2 + 1];
        for(Boolean row[] : dp)
            Arrays.fill(row, null);
        
        return solve(s1, 0, s2, 0, s3);
    }
}