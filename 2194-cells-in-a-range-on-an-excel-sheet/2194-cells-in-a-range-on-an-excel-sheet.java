class Solution {
    public List<String> cellsInRange(String s) {
        
        char ch = s.charAt(0);
        
        List<String> res = new ArrayList<>();
       
        StringBuilder sb = new StringBuilder();
        
        while(ch<=s.charAt(3)){
            int row = s.charAt(1)-'0';
            while(row<=s.charAt(4)-'0'){
                sb.append(ch);
                sb.append(row);
                res.add(sb.toString());
                
                sb.setLength(0);
                row++;
            }
            ch+=1;
        }
        return res;
    }
}