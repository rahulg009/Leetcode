class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> store = new HashMap();
        int count =0;
        for(int i=0;i<tasks.length;i++){
            if(!store.containsKey(tasks[i])){
                store.put(tasks[i],1);
            }else{
                store.put(tasks[i],store.get(tasks[i])+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> hmap:store.entrySet()){
            int x = hmap.getValue();
           
            
            if(x<2){
                return -1;
            }
            
            else if(x%3==0){
                count+=x/3;
            }
            else{
                count+= (x/3)+1;
            }
        }
        
        return count;
    }
}