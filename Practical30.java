/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical30;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */

class MyException extends Exception{
@Override
public String toString(){
return "I am toString()";
}
@Override
public String getMessage(){
return "I am getMessage()";
}
}
class MaxAgeException extends Exception{
@Override
public String toString(){
return "Age cannot be greater than 125";
}
@Override
public String getMessage(){
return "Make sure that the value of age entered is correct";
}
}
public class Practical30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int age;
System.out.print("Enter the age : ");
age=sc.nextInt();
System.out.println();
if(age<21)
{
try{
throw new ArithmeticException("This is an exception");
}
 catch(ArithmeticException e){
       System.out.println(e.getMessage());
       System.out.println(e.toString());
       e.printStackTrace();
       System.out.println("Finished");
}
finally{
       MyException e1=new MyException();
       MaxAgeException e2=new MaxAgeException();
           System.out.println(e1.getMessage());
           System.out.println(e1.toString());
           System.out.println(e2.getMessage());
           System.out.println(e2.toString());
           // here even if I call the ToString method and getmessage method of the 
           // MyException class they will still not be overridden
}
System.out.println("Terminate Execution");
}
}
}
   
    

