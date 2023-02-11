/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical23;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author PRIYA ANU
 */
class Circle
{
  Scanner s=new Scanner(System.in);
  float radius,area;
  int count=0;
 Circle()
 {
   radius=0.0f;
 }
 void getdata()
{
    System.out.print("\n Enter the radius :");
    radius=s.nextFloat();
       
}
void Area()
{
   System.out.print("\n\t\t SHAPE "+ ++count +" CIRCLE \n\n"); 
   
   System.out.print("\nAREA OF CIRCLE: "); 
   area= 3.1415926f*radius*radius;
   System.out.print(+area+ "\n"); 
   
}
}

class Rectangle
{
  Scanner s=new Scanner(System.in);
  float length,width,area;
  int count=0;
 Rectangle()
 {
   length=0.0f;
   width=0.0f;
 }
 void getdata()
{
    System.out.print("\n Enter the length :");
    length=s.nextFloat();
    System.out.print("\n Enter the width :");
    width=s.nextFloat();
       
}
void Area()
{
   System.out.print("\n\t\t SHAPE "+ ++count +" RECTANCLE \n\n"); 
   
   System.out.print("\nAREA OF RECTANGLE: "); 
   area= length*width;
   System.out.print(+area+ "\n"); 
   
}
}

class square
{
  Scanner s=new Scanner(System.in);
  float side,area;
  int count=0;
   square()
 {
   side=0.0f;
 }
 void getdata()
{
    System.out.print("\n Enter the side :");
    side=s.nextFloat();
       
}
void Area()
{
   System.out.print("\n\t\t SHAPE "+ ++count +" SQUARE \n\n"); 
   
   System.out.print("\nAREA OF SQUARE: "); 
   area= side*side;
   System.out.print(+area+ "\n");    
}
}
class triangle
{
  Scanner s=new Scanner(System.in);
  float side,height;
  double area;
  int count=0;
  triangle()
 {
   side=0.0f;
   height=0.0f;
   
 }
 void getdata()
{
    System.out.print("\n Enter the side :");
    side=s.nextFloat();
    System.out.print("\n Enter the height :");
    height=s.nextFloat();
    
       
}
void Area()
{  
  
   System.out.print("\n\t\t SHAPE "+ ++count +" TRIANGLE \n\n"); 
   
   System.out.print("\nAREA OF RIGHT TRIANGLE: "); 
   area=(side*height)/2;
   System.out.print(+area+ "\n"); 
   
}
}
public class Practical23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ch;
        Scanner s=new Scanner(System.in);
        System.out.print("\n\t AREAS ");
        System.out.print("\n 1) CIRCLE");
        System.out.print("\n 2) RECTANGLE ");
        System.out.print("\n 3) SQUARE ");
        System.out.print("\n 4) TRIANGLE");
       do
       {
         System.out.print("\n Enter the option");
         int n = s.nextInt();
         System.out.println();
        switch(n)
        {
         case 1: 
               System.out.print("\n\t\t CIRCLE");
               Circle c=new Circle();
               c.getdata();
               c.Area();
               break;
         case 2: 
               System.out.print("\n\t\t RECTANGLE");
               Rectangle r=new Rectangle();
               r.getdata();
               r.Area();
               break;
         case 3:
               System.out.print("\n\t\t SQUARE");
               square sq=new square();
               sq.getdata();
               sq.Area();
               break;
         case 4: 
               System.out.print("\n\t\t TRAINGLE");
               triangle t=new triangle();
               t.getdata();
               t.Area();
               break;
         default:
               System.out.print("\n\t\t WRONG OPTION ");
               
        }
        System.out.print("\n\nWant to try more options??? ----> Enter 1 : ");
        ch=s.nextInt();   
        
       }while(ch==1);
    }
    
}
