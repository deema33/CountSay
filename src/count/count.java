package count;

public class count {

    static String getNextTerm(String input) // this section develops the next set until limit is reached
    {
        if("1".equals(input) ){
            return "1";
        }
        
        return null;
    }

    static String getNthTerm(int n) // this section breaks up the number
    {
         
         n = 5;
         for(int i = 1; i < n; i++){
             //if(getNextTerm.charAt(i) == getNextTerm.charAt(i - 1))
             // count++;
             int getNextTerm;
             getNextTerm = i - 1;
            
            
            for(int j = 3; i>=j ; j--){
                int getNthTerm = i - j;
            }
                
        
        return "count";
    }

    count(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
