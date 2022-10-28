class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        List<List<String>> store = new ArrayList<>();
        for(int i=0;i<n;i++){
            char [] st = strs[i].toCharArray();
            Arrays.sort(st);
            String temp = new String(st);
            if(hm.containsKey(temp)){
                hm.get(temp).add(strs[i]);
            }else{
                ArrayList<String> t = new ArrayList<>();
                t.add(strs[i]);
                hm.put(temp,t);
            }
        }
        
        for(String i:hm.keySet()){
            store.add(hm.get(i));
        }
        
        return store;
        
    }
}