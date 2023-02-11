/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical14;

/**
 *
 * @author PRIYA ANU
 */
class Constructor
{
  float a=7.89f;
  float b=8.56f;
  
    Constructor()
  { 
     System.out.println(" Its a default constructor "); 
     System.out.println(" The value of a is: " +a+" The value of b is:"+b+"\n"); 
  }

   Constructor(float a,float b)
  { this.a=a;
    this.b=b;
    System.out.print(" Its a parameterized constructor of: both a and b as FLOAT type \n"); 
    System.out.println(" The value of a is: " +a+" The value of b is:"+b+"\n"); 
  }
    Constructor(int a,float b)
  { this.a=a;
    this.b=b;
    System.out.print(" Its a parameterized constructor of: a as INT and b as FLOAT type \n"); 
    System.out.println(" The value of a is: " +a+" The value of b is:"+b+"\n"); 
  }
    Constructor(int a,int b)
  { this.a=a;
    this.b=b;
    System.out.print(" Its a parameterized constructor of: both a and b as INT type \n"); 
    System.out.println(" The value of a is: " +a+" The value of b is:"+b+"\n"); 
  }


}
public class Practical14 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(7.5f,55.7f);
        Constructor obj3 = new Constructor(7,5);
        Constructor obj4 = new Constructor(7,5.57f);
    }
    
}
