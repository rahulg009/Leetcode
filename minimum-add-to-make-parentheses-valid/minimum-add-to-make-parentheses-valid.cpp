class Solution {
public:
    int minAddToMakeValid(string s) {
            unordered_map<char, char> mp;
    mp['('] = ')';
    
    stack<char> st;
        int count=0;
    int i = 0;
    while(s[i]) {
        if(s[i] == '(' ) {
            count++;
            st.push(s[i]);
            
        } else {
            if(!st.empty() && s[i] == mp[st.top()]){
                st.pop();
                count--;
            }
                
            else{
               count++; 
            }
                
        }
        i++;
    }
    
  
    
    return count;
}
        
    
};