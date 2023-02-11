/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical28;
import package_NEW.package_class;
/**
 *
 * @author PRIYA ANU
 */
 class Compare extends package_class
    {
        public Compare()
        {
             System.out.println("\nCONSTRUCTOR of compare ( main class) \n");
        }
        
        public void greatest()
        {
            if(r>l)
            {
               System.out.println("\nValue of r ( "+r+" ) is more than the value of l ( "+l+" ) "); 
            }
            else
            {
               System.out.println("\nValue of l ( "+l+" ) is more than the value of r ( "+r+" ) "); 
            }
        }
    }

public class Practical28 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compare ob1 = new Compare();
        ob1.getvalue();
        ob1.display();
        ob1.greatest();
    }
    
}
