class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> hmap = new HashMap<>();
        Set<Integer> hset = new HashSet();
        int count =0;
        for(int i=0;i<s.length();i++){
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(char it:hmap.keySet()){
            int freq = hmap.get(it);
            if(!hset.contains(freq)){
                hset.add(freq);
            }else{
                while(freq>0 && hset.contains(freq)){
                    freq--;
                    count++;
                }
                if(freq>0)hset.add(freq);
            }
        }
        
        return count;
        
    }
}