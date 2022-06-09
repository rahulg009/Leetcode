class Solution {
    public String removeDigit(String number, char digit) {
        int ans =0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit && i!=number.length()-1 && number.charAt(i+1)>digit){
                ans =i;
                break;
            }
            if(number.charAt(i)==digit){
                ans =i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<number.length();i++){
            if(ans!=i){
                sb.append(number.charAt(i));
            }
        }
        
        return sb.toString();
    }
}