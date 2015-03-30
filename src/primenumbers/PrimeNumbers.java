/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author serg72u
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean prime = true;
        int modulo = 0;
        System.out.println("Prime numbers:");
        for (int i = 2; i < 10000; i++) {
               for (int j = 2; j < 10000; j++) {
                   
                   if (j == i) break;
                   
                   modulo = i % j; 
                   //System.out.println(i + " % " + j + " = " + modulo);
                       if (modulo == 0) {                        
                           prime = false;
                           break;
                       }            
                   }
            if (prime) System.out.println(i + ", ");   
            prime = true;
           }
    }
    
}
