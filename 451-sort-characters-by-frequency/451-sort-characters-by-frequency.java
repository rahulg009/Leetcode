class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> mp = new HashMap<>();
        
        for(char c :s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue((a,b)->(mp.get(b)-mp.get(a)));
        pq.addAll(mp.keySet());
        
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<mp.get(ch);i++){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}