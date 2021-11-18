class Solution {
    public int maximumSwap(int num) {
        char []ch= String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length;i++){
            int maxi=i;
            for(int j=ch.length-1;j>i;j--){
                if(ch[j]>ch[maxi]){
                    maxi=j;
                }
            }
            if(maxi>i){
                char temp = ch[i];
                ch[i]= ch[maxi];
                ch[maxi]=temp;
                return Integer.valueOf(new String(ch));
            }
        }
        return num;
        
    }
}