/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.inheritance.question;

 
class ClockTime 
{
int hour;
 int minute;
  String amPm;

 
ClockTime(int h,int min,String ap)
{ hour=h;
  minute=min;
  amPm=ap;
}
 

public void advance(int time) 
 {

     minute +=time;
     while(minute>=60)
     {hour++;
     minute -= 60;
     }
       while(hour>12)
     {hour -=12;
     
     if (amPm.equals("AM"))
     {
         amPm="PM";
     }
     else
     {
         amPm="AM";
     }
     }
      System.out.println(" Final timing---->: "+hour+ " : "+minute+" "+amPm);
     
 }
 }    
  

/*
 *
 * @author PRIYA ANU
 */
public class NewInheritanceQuestion {

    
    public static void main(String[] args) 
    {
        // TODO code application logic here
     ClockTime time = new ClockTime(3,27,"PM");
     time.advance(1); // 6:28 PM
     time.advance(30); // 6:58 PM
     time.advance(5); // 7:03 PM
     time.advance(60); // 8:03 PM
     time.advance(128); // 10:11 PM
     time.advance(180); // 1:11 AM
     time.advance(1440); // 1:11 AM (1 day later)
     time.advance(21075); // 4:26 PM (2 weeks later)
   System.out.println();   
     
    }
     
    }
    

