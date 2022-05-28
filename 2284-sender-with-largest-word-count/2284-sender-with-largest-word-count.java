class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        
        HashMap<String,Integer> store = new HashMap<>();
        
        int max =0;
        String name ="";
        
        for(int i=0;i<messages.length;i++){
            
            String [] store1 = messages[i].split(" ");
            
            int freq = store.getOrDefault(senders[i],0)+store1.length;
            
            store.put(senders[i],freq);
            
            if(store.get(senders[i])>max){
                max=store.get(senders[i]);
                name= senders[i];
            }else if(store.get(senders[i])==max && name.compareTo(senders[i])<0){
                name=senders[i];
            }
        }
        
        return name;
    }
}