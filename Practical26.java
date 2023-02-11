/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical26;

/**
 *
 * @author PRIYA ANU
 */
interface Addition
{
    public void function1();
    public int function2(int a, int b);
}
class numbers implements Addition
{
    @Override
    public void function1()
    {
        System.out.println("------> This is function 1");
         System.out.print("\n function with void return type called !! ");
    }
    @Override
    public int function2(int a, int b)
    {
        System.out.print("\n------> This is function 2 \n");
        System.out.print("\n Value of parameterized functional addition (5+6) : ");
        return a+b;
        
    }
}


public class Practical26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        numbers obj1=new numbers();
        obj1.function1();
        c=obj1.function2(5,6);
        System.out.println(c);
        System.out.println();
    }
    
}
