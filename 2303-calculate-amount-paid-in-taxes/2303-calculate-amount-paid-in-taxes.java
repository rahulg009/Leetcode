class Solution {
  public double calculateTax(int[][] brackets, int income) {
    int summ = 0;
    
    for(int i = 0;  i != brackets.length; i++){
      int dif = i == 0 ? brackets[i][0] : brackets[i][0] - brackets[i-1][0];
      
      if(income > dif){
        summ   += dif * brackets[i][1];
        income -= dif;
      }else{
        if(income != 0) summ += income * brackets[i][1];
        break;
      }
    }
    
    return (double)summ / 100;  
  }
}