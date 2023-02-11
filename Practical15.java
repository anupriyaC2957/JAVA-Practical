/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical15;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1,x2,x3,y1,y2,y3;
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();
        
         System.out.print("\nCOMPARISON \n");
        System.out.print("\t\tFIRST NUMBER\n");
        x1= x * 1000;
        System.out.println("the value of x after taking into consideration of 4 points after decimal  "+x1+" \n ");
        x2=Math.round(x1);
        System.out.println(" Rounding of the number in respect to the number at the end "+x2+" \n ");
        x3 = x2/1000;
        System.out.println(" Number after placing the decimal point "+x3+" \n ");
        
        System.out.print("\t\tSECOND NUMBER\n");
        y1= y * 1000;
        System.out.println("the value of y after taking into consideration of 4 points after decimal  "+y1+" \n ");
        y2=Math.round(y1);
        System.out.println(" Rounding of the number in respect to the number at the end "+y2+" \n ");
        y3 = y2/1000;
        System.out.println(" Number after placing the decimal point "+y3+" \n ");

        if (x3 == y3)
        {
            System.out.println("\"They are the same up to three decimal places\"");
        }
        else
        {
            System.out.println("\"They are not similar upto 3 decimal places \"");
        }
    
    }
    
}
