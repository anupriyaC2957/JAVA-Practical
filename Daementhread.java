/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daementhread;

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
        System.out.println( Thread.currentThread());
    }
}

public class Daementhread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo1 d=new demo1(" THREAD 1 ");
        demo1 d1=new demo1(" THREAD 2 ");
        d1.start();
        System.out.println(" is thread 2 daemon : "+d1.isDaemon()); 
        d.setDaemon(true);
        d.start();
        System.out.println(" is thread 1daemon : "+ d.isDaemon()); 
        System.out.println(" thread 1 priority " + d.getPriority());
         System.out.println(" thread 2 priority " + d1.getPriority());
    }
    
}
