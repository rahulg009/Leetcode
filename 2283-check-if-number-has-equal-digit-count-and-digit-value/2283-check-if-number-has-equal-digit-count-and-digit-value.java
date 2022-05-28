class Solution {
    public boolean digitCount(String num) {
        
        int[] array = new int[10];
        
        for(char c:num.toCharArray()){
            array[c-'0']++;
        }
        
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)-'0'!=array[i]) return false;
        }
        
        return true;
    }
}