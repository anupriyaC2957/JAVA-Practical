/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsynchronization;
/*
BY THE METHOD OF SYNCHRONIZED STATEMENT */
class Table{  
 void printTable(int n){
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
  try{  
      Thread.sleep(100);  
     }catch(InterruptedException e){System.out.println(e);}  
   }  
 }  
}  
  
class MyThread1 extends Thread{  
Table t = new Table ();    
MyThread1(Table t1){  
this.t=t1;  
}  
@Override
public void run(){  
    
synchronized(t){                // synchrozied for the object of the table 
t.printTable(5);  
System.out.println(t.getClass()); 

}  
}
  
}  
class MyThread2 extends Thread{  
Table t = new Table ();    
MyThread2(Table t){  
this.t=t;  
}  
@Override
public void run(){  
synchronized(t){
t.printTable(100);  
System.out.println(t.getClass()); 
}  
}  
}

/*
class Table{  
 synchronized void printTable(int n){    // using synchronized method 
   for(int i=1;i<=5;i++){  
     System.out.println(n*i); 
      try{  
      Thread.sleep(100);  
     }catch(InterruptedException e){System.out.println(e);}  
   }  
 }  
}  
  
class MyThread1 extends Thread{  
Table t = new Table ();  
MyThread1(Table t){  
this.t=t;  
}  
@Override
 public void run(){  
 // synchronized(t) then we use to call printTable and mainting them in synchronized manner   
t.printTable(10);  
 
}
  
}  
class MyThread2 extends Thread{  
Table t = new Table ();   
MyThread2(Table t){  
this.t=t;  
}  
@Override
public void run(){  
t.printTable(100);  

}
} */
public class Threadsynchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Table obj = new Table();//only one object  

MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  

t2.start();
t1.start(); 
        
}  
} 

/*
class Table{  
  void printTable(int n){    // without synchronization 
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
  try{  
      Thread.sleep(400);  
     }catch(InterruptedException e){System.out.println(e);}  
   }  
 }  
}  
  
class MyThread1 extends Thread{  
Table t = new Table ();   
MyThread1(Table t){  
this.t=t;  
}  
@Override
 public void run(){  
    
t.printTable(5);  
 
}
  
}  
class MyThread2 extends Thread{  
Table t = new Table ();    
MyThread2(Table t){  
this.t=t;  
}  
@Override
public void run(){  
t.printTable(100);  

}
}
*/