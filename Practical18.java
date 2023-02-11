/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical18;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
        int n,year;
        int option;
        do{
        System.out.print("\nEnter the current year: ");
        year=sc.nextInt();
        System.out.print("\nEnter the month of the year (in number): ");
        n=sc.nextInt();
        
        if(year%4==0 && n==2) //leap year
            System.out.println("The month has 29 days");
        
        else{
            if(n==2)
                System.out.println("The month has 28 days: ");
            
            else if(n<=7){
                if(n%2!=0)
                    System.out.println("The month has 31 days");
                else
                    System.out.println("The month has 30 days");  
            }
            
            else if(n>=8 && n<=12){
                if(n%2==0)
                    System.out.println("The month has 31 days");
                else
                    System.out.println("The month has 30 days");  
               }
            
            else
                System.out.println("There month number entered is incorrect");
        }
        System.out.println("Enter 0 to exit ");
        option=sc.nextInt();
        }while(option!=0);
    }
}