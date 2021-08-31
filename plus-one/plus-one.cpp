class Solution {
public:
    vector<int> plusOne(vector<int>& digits) 
    {
        int carry= 1;
        int right = digits.size()-1;
        for(int i=right;i>=0;i--)
        {
            if(carry == 0) 
            {
                break;
            }
            else{
                digits[i]+=carry;
                carry = digits[i]/10;
                digits[i]%=10;
            }
        }
        if(carry!=0)
        {
            digits.insert(digits.begin(),carry);
        }
        return digits;
    }
};