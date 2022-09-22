class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] store = s.split(" ");
        
        for(String x:store){
            StringBuilder rev = new StringBuilder(x);
            rev.reverse();
            sb.append(rev+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
        
    }
}