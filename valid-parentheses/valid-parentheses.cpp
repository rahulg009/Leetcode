class Solution {
public:
    bool isValid(string s) {
    unordered_map<char, char> mp;
    mp['('] = ')', mp['{'] = '}', mp['['] = ']';
    
    stack<char> st;
    int i = 0;
    while(s[i]) {
        if(s[i] == '(' || s[i] == '{' || s[i] == '[') {
            st.push(s[i]);
        } else {
            if(!st.empty() && s[i] == mp[st.top()])
                st.pop();
            else
                return false;
        }
        i++;
    }
    
    if(st.empty())
        return true;
    
    return false;
}
};