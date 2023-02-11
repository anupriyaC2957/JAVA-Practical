/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;

/**
 *
 * @author PRIYA ANU
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    static void factorial(int num)
    {int fact=1,i;
        for(i=1;i<num;i++)
        {fact+=fact*i;
        }
         System.out.println(" FACTORIAL is " +fact);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num=5;
      factorial(num);
     
        }
    }
    

