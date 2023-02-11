/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical32;

/**
 *
 * @author PRIYA ANU
 */
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
//        while(true) // runs in a loop
            while(i<5){
System.out.println("My Thread1 is running \n");
i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
            while(i<5){
System.out.println("My Thread2 is running \n");
i++;
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<5){
System.out.println("My Thread3 is running \n");
i++;
        }
    }
}

public class Practical32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        System.out.println(" current thread " + Thread.currentThread().getName());
        MyThread3 t3=new MyThread3();

        t1.start(); // to start a thread
        t2.start();
        t3.start();

        // isAlive function
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());

System.out.println(" current thread " + Thread.currentThread().getName());


        // using setName and getName methods
       
System.out.println("The name of the first thread is: "+t1.getName());
System.out.println("The name of the second thread is: "+t2.getName());
 t1.setName("First Thread");
 t2.setName("Second Thread");
 System.out.println("The name of the first thread is: "+t1.getName());
System.out.println("The name of the second thread is: "+t2.getName());       
    }
}