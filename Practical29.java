/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical29;
import java.util.Scanner;
/**
 *
 * @author PRIYA ANU
 */
final class Immutable {

  Scanner s= new Scanner(System.in);
  
  private final String name;
  private final int year_of_birth;

  Immutable(String name, int date){
    this.name = name;
    year_of_birth= date;
  }

  public String Name() 
  {
    return name;
  }

  public int Year_of_Birth() {
    return year_of_birth;
  }
 }

public class Practical29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Immutable obj= new Immutable("Anupriya Chandrasekhar",2002);
           System.out.println("Name : " + obj.Name());
           System.out.println("Year of Birth : " + obj.Year_of_Birth());

    }
    
}
