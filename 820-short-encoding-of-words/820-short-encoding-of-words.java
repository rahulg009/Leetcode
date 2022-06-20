class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        Arrays.sort(words,(a,b)->b.length()-a.length());
        HashSet<String> hset = new HashSet();
        int length =0;
        for(int i=0;i<words.length;i++){
            int flag =0;
            
            for(String s :hset){
                if(s.endsWith(words[i])){
                    flag =1;
                    break;
                }
            }
            
            if(flag==0){
                length+= words[i].length()+1;
                hset.add(words[i]);
            }
        }
        
        return length;
    }
}