/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical7;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.println("\n Enter the radius");
        float radius = s.nextFloat();
        System.out.println("\t\t Area of circle ");
        float area= (float) (3.14*radius*radius);
        System.out.println("Area of circle is: "+area);
        System.out.println("\t\t Perimeter of circle ");
        float perimeter = (float) (2*3.14*radius);
        System.out.println("Perimeter of circle is: "+perimeter);
        
        
    }
    
}
