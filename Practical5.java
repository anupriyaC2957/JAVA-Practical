/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

/**
 *
 * @author PRIYA ANU
 */
public class Practical5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // using commond line argument
        String a;
        System.out.println("First number is " +args[0]);
        System.out.println("Second number is " +args[1]);
        String c = args[0];
        String d = args[1];
        a=c+d;
        System.out.println("concatenated string " +a);
        String length= new String(a);
        System.out.println("String length is: " +a.length());
        
    }
    
}
