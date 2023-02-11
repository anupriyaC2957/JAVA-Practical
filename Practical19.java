/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical19;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
public class Practical19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int year,month,day;
        
        System.out.print("\n Enter your year of birth: ");
        year=sc.nextInt();
        System.out.print("\nEnter your month of birth: ");
        month=sc.nextInt();
        System.out.print("\nEnter your day of birth: ");
        day=sc.nextInt();
        
 
        int days_in_the_year=0,days_in_the_month=0;
        int days_elapsed_in_2022;
       
        days_elapsed_in_2022=31; // as of current day-31/01/2022
        
        for(int i=year+1;i<=2021;i++){  // no of days from 2002 - 2021
         if(year%4==0) 
              days_in_the_year=days_in_the_year+366;
        
         else
              days_in_the_year=days_in_the_year+365;
        }
       
        
        for(int i=month;i<=12;i++)  //  no of days from Feb 2002 to Dec 2002 
        {
          if(year%4==0 && i==2)  
              days_in_the_month=days_in_the_month+29;
          else
          {
           if(i==2)
               days_in_the_month=days_in_the_month+28;
           
           else if(i<=7)
           {
               if(i%2!=0)
                   days_in_the_month=days_in_the_month+31;
               else
                   days_in_the_month=days_in_the_month+30; 
           }           
            else if(i>=8 && i<=12)
            {
              if(i%2==0)
                   days_in_the_month=days_in_the_month+31;
               else
                  days_in_the_month=days_in_the_month+30;
            }
          }
       }
        
        int days_elapsed=days_in_the_month-day;
        int total_days=days_in_the_year+days_elapsed+days_elapsed_in_2022;
        
        float age;
        age=total_days/365f;
      
        System.out.println("\nYour present age is : "+age+" years\n");
    } 
}

  
