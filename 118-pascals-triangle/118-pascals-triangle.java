class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> store = new ArrayList<List<Integer>>();
       List<Integer> row,temp = null;
        
        for(int i=0;i<numRows;++i){
            row = new ArrayList<Integer>();
            
            
            for(int j=0;j<=i;++j){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(temp.get(j-1)+temp.get(j));
                }
                
            }
            temp=row;
            store.add(row);
        }
        
        return store;
        
    }
}