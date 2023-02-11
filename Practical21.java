/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical21;

import java.util.Scanner;

/**
 *
 * @author PRIYA ANU
 */
public class Practical21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s =new Scanner (System.in);
        
         int ch=0;
         /* StringBuffer is a string, but can be modified
          as its length and content can be changed through certain method calls 
          or in simple words we can say that when changes are made to the 
          original string itself during a program then its called a string buffer*/
         
         System.out.print("\n Enter the STRING BUFFER 1:");
         StringBuffer s1 = new StringBuffer();
         s1.append(s.nextLine());
         System.out.print("\n Enter the STRING BUFFER 2:");
         StringBuffer s2 = new StringBuffer();
         s2.append(s.nextLine());
        
         
         System.out.print("\n\t OPERATIONS USING STRING BUFFER ");
        System.out.print("\n 1) Length of a StringBuffer");
        System.out.print("\n 2) Capacity of a StringBuffer ");
        System.out.print("\n 3) Character at specific index of StringBuffer ");
        System.out.print("\n 4) Modify the nth character of StringBuffer");
        System.out.print("\n 5) Set the length of the string to n ");
        System.out.print("\n 6) Append string 1 to string 2 ");
        System.out.print("\n 7) Insert string 2 in string 1 at position n ");
        System.out.print("\n 8) Reverse the stringBuffer ");
        System.out.print("\n 9) Replace the stringBuffe ");
        System.out.print("\n 10) Substring of StringBuffer ");
        System.out.print("\n 11) Delete the StringBuffer ");
        System.out.println();
        
        do
        {
          System.out.print("\n Enter the option");
          int n = s.nextInt();
          System.out.println();
        switch(n)
        {
            case 1:
                   System.out.print("\n\t\t LENGTH OF STRINGBUFFER \n");
                   int length_stringb1 =s1.length();
                   System.out.println("STRING BUFFER 1 --->  "+length_stringb1);
                   int length_stringb2 =s2.length();
                   System.out.println("STRING BUFFER 2 --->  "+length_stringb2);
                   break;
                   
           case 2:  
                   System.out.print("\n\t\t CAPACITY OF STRINGBUFFER \n");
                   /* Returns the capacity of the String Buffer
                      The available amount of storage available for newly inserted character */
                   int capacity_stringb1 =s1.capacity();
                   System.out.println("STRING BUFFER 1 --->  "+capacity_stringb1);
                   int capacity_stringb2 =s2.capacity();
                   System.out.println("STRING BUFFER 2 --->  "+capacity_stringb2);
                   break;
                   
           case 3:  
                    System.out.print("\n\t\t CHARACTER AT SPECIFIC INDEX OF STRING BUFFER \n");
                    for(int i=0; i<s1.length();i++)
                    {  
                    char c = s1.charAt(i);  
                    System.out.println("In STRING BUFFER 1 ---> char at "+i+" index is: "+c);
                    }
                   System.out.println();
                   for(int i=0; i<s2.length();i++)
                    {  
                    char x = s2.charAt(i);  
                    System.out.println("In STRING BUFFER 2 ---> char at "+i+" index is: "+x);
                    }
                   break;
                   
           
           case 4:
                  System.out.println("\n\t\tMODIFY THE Nth CHARACTER OF THE STRING\n");
                  
                  System.out.println("In STRING BUFFER 1\n");
                  System.out.print("Enter the character index to be changed ");
                  int num =s.nextInt();
                  System.out.print("\nEnter the character to which it has to be changed ");
                  char cha=s.next().charAt(0); //Character input 
                  s1.setCharAt(num,cha);
                  System.out.println("\nMODIFIED STRING BUFFER 1 ---> "+s1+ "\n");
                  
                  System.out.println("In STRING BUFFER 2\n");
                  System.out.print("Enter the character index to be changed ");
                  int num1 =s.nextInt();
                  System.out.print("\n Enter the character to which it has to be changed ");
                  char cha1=s.next().charAt(0);
                  s2.setCharAt(num1,cha1);
                  System.out.println("\nMODIFIED STRING BUFFER 1 ---> "+s2+ "\n");
                  break;
           
           case 5:
                  System.out.println("\n\t\tSET THE LENGTH OF THE STRING TO N \n");
                  
                  System.out.println("In STRING BUFFER 1\n");
                  System.out.print("Enter the new length \n");
                  int new_length =s.nextInt();
                  s1.setLength(new_length);
                  System.out.println("NEW STRING BUFFER 1 ---> "+s1+ "\n");
                  
                  System.out.println("In STRING BUFFER 2\n");
                  System.out.print("\n enter the new length \n");
                  int new_length1 =s.nextInt();
                  s2.setLength(new_length1);
                  System.out.println("NEW STRING BUFFER 1 ---> "+s2+ "\n");
                  
                break;
                
           case 6:     
                 System.out.print("\n\t\t APPEND STRING 1 to STRING 2 \n");
                 
                  s1.append(s2);
                  System.out.println("NEW STRING BUFFER ---> "+s1+ "\n");
                  s1.append("hello world");
                  System.out.println("ATTACHING 'hello world' to NEW STRING BUFFER ---> "+s1+ "\n");
                break;
                
           case 7:
                 System.out.print("\n\t\t INSERT STRING 2 IN STRING 1 AT Nth position \n");
                  System.out.print("Enter the index at which string 2 has to be inserted \n");
                  int num3 =s.nextInt();
                  s1.insert(num3,s2);
                  System.out.println("NEW STRING BUFFER ---> "+s1+ "\n");   
               break;
          
            case 8:
                 System.out.print("\n\t\t REVERSE THE STRING BUFFER \n");
                  s1.reverse();
                  System.out.println(" REVERSED NEW STRING BUFFER 1 ---> "+s1+ "\n");
                  s2.reverse();
                  System.out.println(" REVERSED NEW STRING BUFFER 2 ---> "+s2+ "\n");   
               break;
               
            case 9:
                   System.out.print("\n\t\t REPLACE THE STRING BUFFER \n");
                   
                  System.out.println("In STRING BUFFER 1 add 'hello' in between \n");
                   
                  System.out.print("Enter the starting index from which string has to be changed  ");
                  int num4 =s.nextInt();
                  System.out.print("\nEnter the ending index from which string has to be changed  ");
                  int num5 =s.nextInt();
                 
                  s1.replace(num4,num5,"hello");
                 System.out.println("MODIFIED STRING BUFFER 1 ---> "+s1+ "\n");
                  
                  System.out.println("In STRING BUFFER 2\n");
                  System.out.print("Enter the starting index from which string has to be changed  ");
                  int num6 =s.nextInt();
                  System.out.print("\nEnter the ending index from which string has to be changed  ");
                  int num7 =s.nextInt();
                  
                  s2.replace(num4, num5,"BEST");
                  System.out.println("MODIFIED STRING BUFFER 2 ---> "+s2+ "\n");
                  break;
             
            case 10: 
                System.out.print("\n\t\t SUBSTRING OF STRING BUFFER \n");
                
                  System.out.print("\nIn STRING BUFFER 1 ---> give the index from which substring has to be formed");
                  int num8 = s.nextInt();
                  String sub_s1 = s1.substring(num8);
                  System.out.println("\n SUBSTRING from index "+num8+" is: "+sub_s1);
                  
                  System.out.print("\nIn STRING BUFFER 2 ---> give the starting index from which substring has to be formed");
                  int start_num = s.nextInt();
                  System.out.print("\nIn STRING BUFFER 2 ---> give the ending index from which substring has to be formed");
                  int end_num = s.nextInt();
                  String sub_s2 = s2.substring(start_num);
                  System.out.println("\n SUBSTRING from starting index "+start_num+" is: "+sub_s2);
                  break;
             
            case 11:
                System.out.println("In DELETE STRING BUFFER 1\n");
                  System.out.print("Enter the starting index from which string has to be deleted  ");
                  int num11 =s.nextInt();
                  System.out.print("\nEnter the ending index from which string has to be deleted ");
                  int num12 =s.nextInt();
                  s1.delete(num11, num12);
                  System.out.println("MODIFIED STRING BUFFER 1 ---> "+s1+ "\n");
                  
                  System.out.println("In STRING BUFFER 2\n");
                  System.out.print("Enter the starting index from which string has to be deleted  ");
                  int num13 =s.nextInt();
                  System.out.print("\nEnter the ending index from which string has to be deleted  ");
                  int num14 =s.nextInt();
                  
                  s2.delete(num13, num14);
                  System.out.println("MODIFIED STRING BUFFER 2 ---> "+s2+ "\n");
                  break;
           
            default: 
               System.out.print("\n\t\t WRONG OPTION \n");
        }
        System.out.print("\n\nWant to try more options??? ----> Enter 0");
        ch=s.nextInt();
        }while(ch==0);
        
        }
}
