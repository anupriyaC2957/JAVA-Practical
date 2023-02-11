/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical24;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
class employee
{
    String name,designation;
    int salary=5000;
    static int count=0;
    void input()
    {
        Scanner s =new Scanner(System.in);
        System.out.print("\n Enter the NAME of the employee "+ ++count+ ": ");
        name=s.nextLine();
        System.out.print("\n Enter the DESIGNATION of the employee "+ ++count+ ": ");
        designation=s.nextLine();
    }
    void sal()
    {
        if(designation.compareToIgnoreCase("manager")==0)
        {
            salary+=5000;
        }
        else if(designation.compareToIgnoreCase("general manager")==0)
        {
            salary+=10000;
        } 
        else if(designation.compareToIgnoreCase("CEO")==0)
        {
            salary+=20000;
        }
        else
        {
            salary+=2000;
        }
    }
    void display()
    {
        System.out.print("\n The ORICINAL SALARY WAS : 5000 ");
        System.out.println("\n The NEW SALARY IS : " +salary);
    }
}

public class Practical24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee employee1=new employee();
        employee1.input();
        employee1.sal();
        employee1.display();
    }
    
}
