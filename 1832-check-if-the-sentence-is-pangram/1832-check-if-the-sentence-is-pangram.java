class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] count = new int[26];
        
        for(int i=0;i<sentence.length();i++){
            count[sentence.charAt(i)-'a']++;
        }
        
        for(int j:count){
            if(j<1){
                return false;
            }
        }
        return true;
        
    }
}