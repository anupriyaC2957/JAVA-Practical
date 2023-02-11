/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical20;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author PRIYA ANU
 */
public class Practical20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner (System.in);
        
        int ch=0;
         System.out.print("\n Enter the string 1:");
         String s1 = s.nextLine();
         
         char ram[] = s1.toCharArray(); // char to array conversion 
         Arrays.sort(ram); // sorting the array
         System.out.print(ram); 
         
         String ram2 = new String (ram);
         System.out.println();
       
        for(int i =ram2.length()-1 ;i>=0;i--)
        {
            
          char c = ram2.charAt(i);
           System.out.print(c);
          
        }
          
         System.out.print("\n Enter the string 2:");
         String s2 = s.nextLine();
         System.out.print("\n\t OPERATIONS ON STRING (string functions)  ");
        System.out.print("\n 1) Character at specific index");
        System.out.print("\n 2) Length of the string ");
        System.out.print("\n 3) Substring ");
        System.out.print("\n 4) To check if 2 strings are equal (with and without being case sensitive)");
        System.out.print("\n 5) Starts with and ends with check ");
        System.out.print("\n 6) Compare 2 strings ");
        System.out.print("\n 7) Replace the string ");
        System.out.print("\n 8) Convert string from upeer case to lower case and vise versa ");
        System.out.print("\n 9) Concatenate 2 strings ");
        System.out.print("\n 10) Trim function( returns copy of the string) ");
        System.out.println();
        do
        {
          System.out.print("\n Enter the option");
          int n = s.nextInt();
          System.out.println();
        switch(n)
        {
            case 1: 
                    System.out.print("\n\t\t CHARACTER AT SPECIFIC INDEX \n");
                    for(int i=0; i<s1.length();i++)
                    {  
                    char c = s1.charAt(i);  
                    System.out.println("In STRING 1 ---> char at "+i+" index is: "+c);
                    }
                   System.out.println();
                   for(int i=0; i<s2.length();i++)
                    {  
                    char x = s2.charAt(i);  
                    System.out.println("In STRING 2 ---> char at "+i+" index is: "+x);
                    }
                   break;
                   
           case 2:  
                   System.out.print("\n\t\t LENGTH OF STRINGS \n");
                   int length_string1 =s1.length();
                   System.out.println("STRING 1 --->  "+length_string1);
                   int length_string2 =s2.length();
                   System.out.println("STRING 2 --->  "+length_string2);
                   break;
                   
           case 3: 
                  System.out.print("\n\t\t SUBSTRING \n");
                  System.out.print("\nIn STRING 1 ---> give the index from which substring has to be formed");
                  int num = s.nextInt();
                  String sub_s1 = s1.substring(num);
                  System.out.println("\n SUBSTRING from index "+num+" is: "+sub_s1);
                  
                  System.out.print("\nIn STRING 2 ---> give the starting index from which substring has to be formed");
                  int start_num = s.nextInt();
                  System.out.print("\nIn STRING 2 ---> give the ending index from which substring has to be formed");
                  int end_num = s.nextInt();
                  String sub_s2 = s2.substring(start_num,end_num);
                  System.out.println("\n SUBSTRING from starting index "+start_num+"and ending index "+end_num+" is: "+sub_s2);
                  break;
           
           case 4: 
                  System.out.print("\n\t\t TO CHECK IF 2 STRINGS ARE EQUAL\n");
                  boolean r;
                  r=s1.equals(s2);
                  System.out.println("\n Case sensistive condition--> "+r);
                  System.out.println("\n Case sensistive condition--> "+s1.equals(s2));
                  System.out.println("\n NOT Case sensistive condition--> "+s1.equalsIgnoreCase(s2));
                  break;
           
           case 5:
                System.out.print("\n STARTS WITH AND ENDS WITH CHECK \n");
                System.out.print("\nDoes string 1 start with an ?? check!! " +s1.startsWith("an"));
                System.out.print("\nDoes string 2 end with yr ?? check!! " +s2.endsWith("yr"));
                System.out.println();
                break;
                
           case 6:     
                System.out.print("\n\t\t COMPARE 2 STRINGS\n");
                System.out.println("\n Case sensistive condition--> "+s1.compareTo(s2));
                System.out.println("\n NOT Case sensistive condition--> "+s1.compareToIgnoreCase(s2));
                break;
                
           case 7:
               System.out.print("\n\t\t REPLACE THE STRING \n");
               System.out.print("\n Replace a with q in STRING 1 ----> "+s1.replace('a','P'));
               System.out.print("\n Replace STRING 2 ----> with STRING 1: "+s1.replace(s2,s1));
               break;
          
           case 8: 
               System.out.print("\n\t\t CONVERT FROM UPPER TO LOWERCASE AND VISE VERSA \n");
               System.out.print("\n From lower to uppercase STRING 1 ----> "+ s1.toUpperCase());
               System.out.print("\n From upper to lower case  STRING 2 ---->  "+s2.toLowerCase());
               break;
               
           case 9: 
               System.out.print("\n\t\t CONCATENATE 2 STRINGS \n");
               System.out.print("\n Concatenate 2 strings: STRING 1 and STRING 2 ----> "+s1.concat(s2));
               break;
               
           case 10: 
               System.out.print("\n\t\t TRIM THE STRINGS \n");
               // returns copy of the string, with leading and trailing white spaces omitted!!!
               
               System.out.print("\nTrim string 1---> "+s1.trim()+"\n");
               System.out.print("\nTrim string 2---> "+s2.trim()+"\n");
               break;
           
            default: 
               System.out.print("\n\t\t WRONG OPTION \n");
               
        }
        
        System.out.print("\n\nWant to try more options??? ----> Enter 0");
        ch=s.nextInt();
        }while(ch==0);
        
        }
}
