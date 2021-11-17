class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int x = flowerbed.length;
        int count = 0;
        while(i<x){
            if((flowerbed[i]==0) && (i==0 || flowerbed[i-1]==0) && (i==x-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }
            i++;
        }
        return count>=n;
        
        
    }
}