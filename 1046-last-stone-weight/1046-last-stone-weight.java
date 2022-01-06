class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> sol = new ArrayList();
        
        for(int s:stones){
            sol.add(s);
        }
        
        while(sol.size()>1){
            Collections.sort(sol);
            
            int first = sol.get(sol.size()-1);
            int second = sol.get(sol.size()-2);
            
            if(first == second){
                sol.remove(sol.size()-2);
                sol.remove(sol.size()-1);
                
            }else{
                sol.remove(sol.size()-2);
                sol.remove(sol.size()-1);
                
                sol.add(Math.abs(first-second));
                
            }
        }
        
        if(sol.size()==0){
            return 0;
        }
        return sol.get(0);
    }
}