/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical11;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String actual, reverse = "";
        int ch; 
      Scanner s = new Scanner(System.in); 
      do
      {
      System.out.println("Enter a string ");  
      actual = s.nextLine();   
      int l = actual.length();   
      for (int i = l-1; i>= 0; i-- )  
         reverse = reverse + actual.charAt(i);  
      if (actual.contentEquals(reverse))  
  System.out.println("string is a palindrome. AS reversed string is "+reverse+ " and original string was " +actual);  
      else  
  System.out.println(" string isn't a palindrome. AS reversed string is " +reverse+ " and original string was " +actual);  
       System.out.println("Want to enter more??");
        ch=s.nextInt();
      }while(ch==0);
    }
    
}
