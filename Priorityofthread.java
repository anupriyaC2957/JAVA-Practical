/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityofthread;


class MyThr1 extends Thread{
  
    @Override
    public void run(){
        int i = 0;
        while(i<5){
System.out.println("Hi : " + this.getName());
i++;
        }
} }

public class Priorityofthread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThr1 t1 = new MyThr1();
        MyThr1 t2 = new MyThr1();
        MyThr1 t3 = new MyThr1();
        System.out.println("INITIAL PRIORITY");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
            System.out.println();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        MyThr1.yield();
        t1.start();
        MyThr1.yield();
        t2.start();
       
        System.out.println(" current thread " + MyThr1.currentThread().getName());
        MyThr1.yield();
        try {
            t1.join();
        } catch (InterruptedException ex) {
           System.out.println("EXCEPTION");
        }
        t3.start();
       MyThr1.yield();
       
        System.out.println();
        
System.out.println("The priority order of the threads are: ");
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
    }
}
