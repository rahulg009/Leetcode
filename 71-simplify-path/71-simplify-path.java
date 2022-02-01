class Solution {
    public String simplifyPath(String path) {
        
        if(path==null || path.length()==0){
            return "";
        }
        
        Stack<String> store = new Stack<>();
        StringBuilder s = new StringBuilder();
        String[] components = path.split("/");
        
        for(String u:components){
            if(u.isEmpty() || u.equals(".")){
                continue;
            }else if(u.equals("..")){
                if(!store.isEmpty()){
                    store.pop();
                }
            }else{
                store.push(u);
            }
        }
        
        for(String dtr:store){
            s.append("/").append(dtr);
            
        }
        return s.length()==0?"/":s.toString();
        
    }
}