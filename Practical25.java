/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical25;

/**
 *
 * @author PRIYA ANU
 */
abstract class vehicle
{
    public
    int wheels;
    abstract void input();
    abstract void display();
}
class car extends vehicle
{
    @Override
    void input()
    {
        wheels =4;
    }
    @Override
    void display()
    {
        System.out.print("\n\t\t ******CHILD CLASS CAR IS INHERITING THE BASE CLASS VEHICLE******** \n");
        System.out.print("\n\t -> CAR has "+wheels+" wheels \n");
    }
}
class bike extends vehicle
{
    @Override
    void input()
    {
        wheels =2;
    }
    @Override
    void display()
    {
        System.out.print("\n\t\t------CHILD CLASS BIKE IS INHERITING THE BASE CLASS VEHICLE------ \n");
        System.out.print("\n\t -> BIKE has "+wheels+" wheels \n");
    }
}

public class Practical25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        car obj1 =new car();
        obj1.input();
        obj1.display();
        bike obj2=new bike();
        obj2.input();
        obj2.display();
    }
    
}
