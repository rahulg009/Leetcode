class Solution {
    public int percentageLetter(String s, char letter) {
        
        int len = s.length();
        
        
        ArrayList<Character> store = new ArrayList<Character>();
        
        for(int i=0;i<len;i++){
            store.add(s.charAt(i));
        }
        
        int lf = Collections.frequency(store,letter);
      
        float ans = (lf*100)/len;
        
        
        return (int)ans;
        
    }
}