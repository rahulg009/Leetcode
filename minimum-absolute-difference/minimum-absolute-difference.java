class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         Arrays.sort(arr);
     List<List<Integer>> p= new ArrayList();
       int min=0;
        int mina=Integer. MAX_VALUE ;
        
      for(int i=0;i<arr.length-1;i++){
              int dif=Math.abs(arr[i]-arr[i+1]);
    mina=Math.min(dif,mina);
      }

        for(int i=0;i<arr.length-1;i++){
       int dif=Math.abs(arr[i]-arr[i+1]);
    
        if(dif==mina){
              p.add(Arrays.asList(arr[i],arr[i+1])); 
        }
        
}
   return p;     
        
    }
}