class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int len = tasks.length;
        if(n==0) return len;
        
        int res =0;
        
        Map<Character,Integer> mp = new HashMap();
        
        for(char u:tasks){
            mp.put(u,mp.getOrDefault(u,0)+1);
        }
        
        Queue<Pair> pq = new PriorityQueue<>((a,b)-> b.val - a.val);
        List<Pair> wait = new ArrayList();
        
        for(var rg:mp.entrySet()){
            pq.add(new Pair(rg.getKey(),rg.getValue()));
        }
        
        while(!pq.isEmpty()){
            for(int i=0;i<=n;i++){
                if(!pq.isEmpty()){
                    Pair top = pq.poll();
                    top.val--;
                    if(top.val>0){
                        wait.add(top);
                    }
                }
                res++;
                if(pq.isEmpty() && wait.isEmpty()) break;
            }
            pq.addAll(wait);
            wait.clear();
        
        }
        return res;
    }
    class Pair{
        char ch;
        int val;
        
        Pair(char ch,int val){
            this.ch = ch;
            this.val = val;
        }
        
        @Override
        public String toString(){
            return "[ "+this.ch+" "+this.val+" ]";
        }
        
    }
}