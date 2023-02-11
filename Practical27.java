/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg27;
class Bike9 {
    int speedlimit = 90; // final variable

    void run() {
        speedlimit = 400; // cant assign new value to speedlimit as it is already declared as final variable
    }
}

class Bike {
    void run1() {
        System.out.println("running 1");
    }
}

class Honda extends Bike {
    @Override
    void run1() 
    { //here run1 cant override because it is declared as final in class bike already
        System.out.println("running safely with 100kmph");
    }
}

class Bike1 {
    
    void run2() {
        System.out.println("---> running 2");
    }
    
}

class Honda1 extends Bike1 { // here class honda cant sub class final class bike1
    @Override
    void run2() {
        System.out.println("---> running safely with 100kmph");
    }
}


/**
 *
 * @author PRIYA ANU
 */
public class Practical27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bike9 b1 = new Bike9();
        b1.run(); // it will give an error
        Honda h1 = new Honda();
        h1.run1(); // it will give an error
        Honda1 honda = new Honda1();
        honda.run2(); // it will give an error
    }
    
}
