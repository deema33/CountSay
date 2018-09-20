/**
 * The count say sequence starts with the string "1". Each following string is determined by reading out the count of
 * each repeating character and then the character itself. The following list shows the first 7 terms of the count say
 * sequence:
 *
 * 1: 1
 * 2: 11
 * 3: 21
 * 4: 1211
 * 5: 111221
 * 6: 312211
 * 7: 13112221
 *
 */
package CountSay;
public class CountSay
{
    public String getNextTerm(String input)
    {
           if("1".equals(input)){
            return "1";
        }
           return null;
    }

    public String getNthTerm(int n)
    { 
        int count = 1; 

        for( int i = 2; i<n; ++count) {   
            
        }
        return null;
           }

   
}

