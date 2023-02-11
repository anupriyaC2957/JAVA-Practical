/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical31;
import java.io.IOException;
/**
 *
 * @author PRIYA ANU
 */

public class Practical31 extends Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int arr[]=new int[10];
try{
System.out.println(arr[20]);
            int no=10/0;
         }
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array out of bounds exception caught");
e.getMessage();
        }
catch(IOException e){
System.out.println("IO exception caught");
e.getMessage();
        }
catch(ArithmeticException e){
System.out.println("Arithemtic exception caught");
e.getMessage();
        }
catch(Exception e){
System.out.println("Exception caught");
e.getMessage();
}
    }
}