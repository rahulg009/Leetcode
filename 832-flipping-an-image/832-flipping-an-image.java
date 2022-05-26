class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int size = image.length-1;
        int tra = image[0].length-1;
        
        for(int i=0;i<image.length;i++){
            reverse(image[i]);
        }
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j]=image[i][j]^1;
            }
        }
        
        return image;
    }
    public void reverse(int[] arr) {
    int start = 0, end = arr.length - 1;
    while(start < end) {
        int temp = arr[start];
        arr[start] = arr[ end];
        arr[end] = temp;
        start++;
        end--;
    }
    
}
    

}