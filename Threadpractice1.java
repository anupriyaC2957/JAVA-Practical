/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpractice1;

/**
 *
 * @author PRIYA ANU
 */
class demo1 extends Thread {
    
    demo1(String str)
    {
       super(str);
       System.out.println("CONSTRUCTOR"); 
    }

    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i+ " " +getName());
            
        }
    }
}

    public class Threadpractice1
    {
    public static void main(String[] args) {
        // TODO code application logic here
        
        demo1 d=new demo1("THREAD !");
        d.start();
        System.out.println("OLD NAME " +d.getName());
        d.setName(" Thread    +++++++++++");
        System.out.println("NEW NAME "+d.getName());
        demo1 d1=new demo1(" THREAD @");
        d1.start();
    
       
    }
    }

