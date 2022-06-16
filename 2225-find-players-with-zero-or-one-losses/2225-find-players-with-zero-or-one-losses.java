class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> won= new ArrayList();
        List<Integer> lost = new ArrayList();
        Map <Integer,Integer> hamp = new HashMap();
        
        for(int[] m:matches){
            int winner = m[0];
            if(!hamp.containsKey(winner)){
                hamp.put(winner,0);
            }
            hamp.put(m[1],hamp.getOrDefault(m[1],0)+1);
        }
        
        for(int key:hamp.keySet()){
            int count = hamp.get(key);
            
            if(count==0){
                won.add(key);
            }else if(count==1){
                lost.add(key);
            }
        }
               
        Collections.sort(won);
        Collections.sort(lost);
        res.add(won);
        res.add(lost);
        return res;
    }
}