class Solution {
    public int convertTime(String current, String correct) {
        
        int steps =0;
        
        int currenthmins = ((current.charAt(0)-'0')*10+current.charAt(1)-'0')*60;
        
        int currentmmins = ((current.charAt(3)-'0')*10+current.charAt(4)-'0');
        
        int correcthmins =  ((correct.charAt(0)-'0')*10+correct.charAt(1)-'0')*60;
        
        int correctmmins = ((correct.charAt(3)-'0')*10+correct.charAt(4)-'0'); 
            
        
        
       int totalcurrmins = currenthmins+currentmmins;
        
        int totalcorrmins = correcthmins+correctmmins;
        
          while(totalcorrmins>=totalcurrmins) {
            if(totalcorrmins-60<totalcurrmins)break;
            totalcorrmins= totalcorrmins-60;
            steps++;
        }

        
        while(totalcorrmins>=totalcurrmins) {
            if(totalcorrmins-15<totalcurrmins)break;
            totalcorrmins= totalcorrmins-15;
            steps++;
        }
        
                 while(totalcorrmins>=totalcurrmins) {
            if(totalcorrmins-5<totalcurrmins)break;
            totalcorrmins= totalcorrmins-5;
            steps++;
        }
        
         while(totalcorrmins>=totalcurrmins) {
            if(totalcorrmins-1<totalcurrmins)break;
            totalcorrmins= totalcorrmins-1;
            steps++;
        }
        
        return steps;    
    }
}