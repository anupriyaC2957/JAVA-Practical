/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical9;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.println("\n EXPRESSION ax^2+bx+c=0 "); 
        System.out.print("\nEnter the value of coefficient a ");
        float a=s.nextFloat();
        System.out.print("\nEnter the value of coefficient b ");
        float b=s.nextFloat();
        System.out.print("\nEnter the value of coefficient c ");
        float c=s.nextFloat();;
        System.out.println("\n\t\t DISCRIMINANT  ");
        double d;
        d=(b*b)-4*a*c;
        System.out.println(" value of determinant is: "+d);
        double root1;
        double root2;
        if(d==0)
        {
            System.out.println(" roots are real and equal ");
            root1 = root2 = -b /(2*a);
             System.out.format("\n roots are : %f and %f ",root1,root2);
            
        }
        else if(d>0)
        {
            System.out.println(" roots are real and not equal ");
             root1 = (-b + Math.sqrt(d)) /(2*a);
             root2 = (-b - Math.sqrt(d)) /(2*a);
             System.out.format("\n roots are : %f and %f ",root1,root2);
            
        }
        else
        {
             System.out.println(" roots are imaginary ");
            double real = -b / (2 * a);
            double im = Math.sqrt(-d) / (2 * a);
      System.out.format("root1 : %f + %f i", real, im);
      System.out.format("\nroot2 : %f - %f i\n", real, im);
        }
    }
}
