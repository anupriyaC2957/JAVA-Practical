/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg6;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.println("\n Enter n");
        int n = s.nextInt();
        System.out.println(" Enter number");
        int num = s.nextInt();
        System.out.println("\t\t multiplication table of " +num);   
        for(int i=1;i<=n;i++)
        {int mul;
        mul=i*num;
    
        System.out.println(+num+ "*" +i+ " = " +mul);    
        
        }
        
    }
    
}
