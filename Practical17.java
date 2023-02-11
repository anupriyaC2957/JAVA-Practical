/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical17;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i,j,n,s,x;
   System.out.print ("Input number of rows : ");
   Scanner in = new Scanner(System.in);
   n = in.nextInt();

   s=n+4-1;
   System.out.print ("number of spaces for the given rows is: " +s+"\n");
    for(i=1;i<=n;i++)
   { 
    for(x=s;x!=0;x--)
    { 
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    { 
    System.out.print(i+" ");
     }
  System.out.println();
    s--;
    }
    }
}
