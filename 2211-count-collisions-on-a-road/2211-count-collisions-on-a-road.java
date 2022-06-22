class Solution {
public int countCollisions(String s) {
int i,j,k;

     Stack<Character> stk = new Stack<>();
    int ans=0;
    stk.push(s.charAt(0));
    for(i=1;i<s.length();i++)
    {
        //collision case 1 RL
        if(!stk.isEmpty() && stk.peek()=='R' && s.charAt(i)=='L')
        {
            stk.pop();
            ans+=2;
            while(!stk.isEmpty() && stk.peek()=='R')
            {
                stk.pop();
                ans+=1;
            }

            stk.push('S');
        }

        //collision case 2 SL
        else if(!stk.isEmpty() && stk.peek()=='S' && s.charAt(i)=='L')
        {
            ans+=1;
            while(!stk.isEmpty() && stk.peek()=='R')
            {
                ans+=1;
                stk.pop();
            }

            stk.push('S');
        }

        //collision case 3  RS
        else if(!stk.isEmpty() && stk.peek()=='R' && s.charAt(i)=='S' )
        {
            ans+=1;
            stk.pop();
            while(!stk.isEmpty() && stk.peek()=='R')
            {
                ans+=1;
                stk.pop();
            }
            stk.push('S');

        }

        else
            stk.push(s.charAt(i));
    }
    
    return ans;

    
}
}