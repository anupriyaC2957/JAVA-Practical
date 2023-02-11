/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical22;
import java.util.Scanner;

/**
 *
 * @author PRIYA ANU
 */
class record
{
  Scanner s=new Scanner(System.in);
  String name;
  String rollno;
  float marks1,marks2,marks3;
  float marks,percentage;
  int count=0;
 record()
 {
   name=" " ;
   rollno=" ";
   marks1=0;
   marks2=0;
   marks3=0;
 }
void getdata()
{
    System.out.print("\n Enter the name of the student :");
    name=s.nextLine();
    System.out.print("\n Enter the rollno of the student :");
    rollno=s.nextLine();
    System.out.print("\n MARKS IN 3 SUBJECTS ");
    System.out.print("\n Enter the marks in 1 :");
    marks1=s.nextFloat();
    System.out.print("\n Enter the marks in 2 :");
    marks2=s.nextFloat();
    System.out.print("\n Enter the marks in 3 :");
    marks3=s.nextFloat();
    
}
void setdata()
{
   System.out.print("\n\t\t Student number: "+ ++count); 
   
   marks=marks1+marks2+marks3;
   percentage=marks/3;
   System.out.println();
}
void display()
{ 
   setdata();
   System.out.print("\n DISPLAY");
   System.out.print("\n The name of the student :" +name);
   System.out.print("\n The roll number of the student : "+rollno);
   System.out.print("\n Total marks :"+marks);
   System.out.print("\n Percentage :"+percentage);
   System.out.println();
   
}
}
public class Practical22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        record student=new record();
        
          System.out.println();
          student.getdata();
          student.display();
       
        
    }
    
}
