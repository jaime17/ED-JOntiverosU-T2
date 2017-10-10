/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.*;

/**
 *
 * @author emiaj
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<Character>();
        String original;
        String rev="";
        System.out.println("Introduce una palabra para saber si es un palindromo");
        Scanner p= new Scanner(System.in);
        original=p.nextLine();
        int len=original.length();
        for(int i= len -1;i>=0;i--)
            rev= rev + original.charAt(i);
            
            
          for (int i = 0; i < original.length(); i++) {
           
           rev= rev.replace(" ", "");
           original=original.replace(" ", "");
           rev=rev.toLowerCase();
           original=original.toLowerCase();
           
}
          System.out.println(original);
            System.out.println(rev);
          
            
            if(original.equals(rev)){
                System.out.println("Es palindromo");
            }else{
                System.out.println("No es palindromo");
            }
        }
        
        
        
    }
    
