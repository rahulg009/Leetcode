class Solution {
public:
    string longestPrefix(string s) {
        int m = s.size();
        vector<int> prefix(m, 0);
        int i = 1, j = 0;
        while(i < m) {
            if(s[i] == s[j]) {
                prefix[i] = j+1;
                i++;
                j++;
            } else if(j > 0) {
                j = prefix[j-1];
            } else {
                prefix[i] = 0;
                i++;
            }
        }
        return s.substr(0, prefix.back());
    }

};