/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical16;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
class details
{
 static int count=0;
 String Name;
 String employee_code;
 long phone_number;
 
 Scanner s= new Scanner(System.in);
 
 void getdata()
 { System.out.print("\n Enter the name of student ");
   Name = s.nextLine();
    System.out.print("\n Enter the Employee code :");
   employee_code = s.nextLine();
   System.out.print("\n Enter the phone number :");
    phone_number  = s.nextLong();
 }
 void Display()
 {   count++;
     System.out.print(String.format("\n\t\t%20s | %13s | %10d \n\n", Name,employee_code, phone_number));
     System.out.print("count of the employee is : "+count+ "\n\n");
 }
 
}
public class Practical16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        details obj=new details();
        obj.getdata();
        obj.Display();
        details obj2=new details();
        obj2.getdata();
        obj2.Display();
        details obj3=new details();
        obj3.getdata();
        obj3.Display();
    }
    
}
