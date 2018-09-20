/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count;

/**
 *
 * @author deema
 */
public class counttester {

       public static void main(String[] args)
    {
        count number = new count();
        if (args.length < 1)
        {
            System.err.println("missing arguments");
            return;
        
        int n = Integer.parseInt(args[0]);
        String result = count.getNthTerm(n);
        System.out.println(result);
        }
    }
}