/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical10;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        int ch;
        int prime=0;
        do
        {
         System.out.print("\n Enter n:");
        int n = s.nextInt();
       
      for(int i=2;i<=n;i++)
   {   prime=1;
      
     for(int j=2; j<=i/2; j++)             
   { if((i % j) == 0)                
         prime = 0;
         
         
   }
       
   if(prime==1)
      System.out.format("\n%d is prime number.\n", i);
      else
     System.out.format("\n%d is not prime number.\n",i);
    }
    
   System.out.print("\n want to enter more???");
   ch = s.nextInt();
  }while(ch==0);
    }   
}
