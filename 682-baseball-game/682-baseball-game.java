class Solution {
    public int calPoints(String[] ops) {
        
        ArrayList<Integer> store = new ArrayList<Integer>();
        
        for(String i:ops){
            if(i.equals("+")){
                int inp1 = store.get(store.size()-1);
                int inp2 = store.get(store.size()-2);
                store.add(inp1+inp2);
            }else if(i.equals("C")){
                store.remove(store.size()-1);
            }else if(i.equals("D")){
                int inp3 = store.get(store.size()-1);
                store.add(inp3*2);
            }else{
                store.add(Integer.parseInt(i));
            }
        }
        
        int sum =0;
        
        for(int t:store){
            sum = sum+t;
        }
        
        return sum;
        
    }
}