/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg4;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ch=0;
        Scanner s= new Scanner(System.in);
        do
        {System.out.print("\n Enter the name of student ");
        String Name = s.nextLine();
        System.out.print("\n Enter the Mail_id :");
        String Mail_id = s.nextLine();
        System.out.print("\n Enter the Employee code :");
        String employee_code = s.nextLine();
        System.out.print("\n Enter the phone number :");
        long phone_number  = s.nextLong();
        
        System.out.print("\n DETAILS");
        System.out.print("\n Name: "+Name);
        System.out.print("\n Mail_id: "+Mail_id);
        System.out.print("\n Employee Code: "+employee_code);
        System.out.print("\n Phone Number: "+phone_number);
        System.out.print("\n want to enter more ???");
        ch = s.nextInt();
        }while(ch==0);
        
    }
    
}
