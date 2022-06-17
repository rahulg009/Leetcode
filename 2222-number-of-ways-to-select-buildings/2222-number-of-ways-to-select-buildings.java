class Solution {
    public long numberOfWays(String s) {
        
        int zero=0;
        long zeroOne =0;
        int one =0;
        long oneZero =0;
        long total=0;
        
        for(char c:s.toCharArray()){
            if(c == '0'){
                zero++;
                if(one>0){
                    oneZero +=one;
                }
                if(zeroOne>0){
                    total+=zeroOne;
                }
            }else{
                one++;
                if(zero > 0){
                    zeroOne+=zero;
                }
                if(oneZero>0){
                    total+=oneZero;
                }
            }
            
        }
        
        return total; 
    }
}