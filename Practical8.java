/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical8;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fabonacci series
        Scanner s= new Scanner(System.in);
        System.out.println("\n Enter n (series) :");
        int n = s.nextInt();
        
        System.out.println("\n Enter the first number of fabonacci series: ");
        int n1 = s.nextInt();
        System.out.println("\n Enter the second number of fabonacci series: ");
        int n2 = s.nextInt();
        System.out.print("\t" +n1 );
        System.out.print("\t" +n2 );
        for(int i=0;i<n;i++)
        { int n3;
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print("\t" +n3 );
            
        }
      System.out.print("\n" );  
    }
    
}
