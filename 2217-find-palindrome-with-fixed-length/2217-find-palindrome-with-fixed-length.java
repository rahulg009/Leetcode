class Solution 
{
    public long[] kthPalindrome(int[] queries, int intLength) 
    {
        int power=(intLength%2==0) ? (intLength/2 - 1) : (intLength/2);
        int start=(int)Math.pow(10,power);
        long[] answer=new long[queries.length];
        int c=0;
        for(int i=0;i<queries.length;i++)
        {
            String ans=Integer.toString(start+queries[i]-1);
            StringBuilder rev=new StringBuilder();
            rev.append(ans);
            rev.reverse();
            if(intLength%2 == 0)
                ans=ans+rev;
            else
                ans=ans+rev.substring(1,rev.length());
            if(ans.length() == intLength)
                answer[c++]=Long.parseLong(ans);
            else
                answer[c++]=-1;
        }
        return answer;
    }
}