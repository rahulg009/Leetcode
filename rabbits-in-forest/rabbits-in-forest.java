class Solution {
    public int numRabbits(int[] answers) {
        int count=0;
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<answers.length;i++){
            h.put(answers[i],h.getOrDefault(answers[i],0)+1);
    }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            count=count+((e.getKey()+1)*(e.getValue()/(e.getKey()+1)));
         
            if(e.getValue()%(e.getKey()+1)!=0){
                count+=e.getKey()+1;
            }
        }
        return count;
        
}
}
