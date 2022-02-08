class Solution {
    public int addDigits(int num) {
        int rem=0,sum=0,count=0;
        while(num>0){
            rem = num%10;
            sum=sum+rem;
            num=num/10;
        }
        while(sum>0){
            count+=sum%10;
            sum=sum/10;
            
            if(sum==0 && count>9){
                sum=count;
                count=0;
            }
        }
        
        
        return count;
        
    }
}