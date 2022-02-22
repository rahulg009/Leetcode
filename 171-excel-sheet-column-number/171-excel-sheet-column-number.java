class Solution {
    public int titleToNumber(String columnTitle) {
        int position = 0;
        for(char c : columnTitle.toCharArray()){
            position = position * 26 + (int) c - (int) 'A' + 1;
        }
        return position;
    }
}