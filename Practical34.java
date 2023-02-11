/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical34;

import java.awt.*;

/**
 *
 * @author Administrator
 */
 
 class demo {

    demo()
    {
       Frame f = new Frame();
       Frame f1 = new Frame();
     
       Button b=new Button(" CLICK ");
       b.setBounds(100,200,90,90);
       b.setBackground (Color.cyan);
     
       // 10 is x axis and 20 is y axis
       f.setVisible(true);
       f1.setVisible(false);
       f.setSize(700,700);
       f1.setSize(300,400);
       // 3000  frame length and 200 is width of the frame
       f.setTitle("hi");
       f.add(b);
       f.setLayout(null);
      
     
       List l= new List(5);
       l.add("a");
       l.add("b");
       l.add("c");
       l.setBounds(90,90,90,90);  
       l.setBackground (Color.cyan);
       f.add(l);
     
     
       Choice ch = new Choice();
       ch.add("1");
       ch.add("2");
       ch.add("3");
       ch.setBounds(250,250,90,90);  
       f.add(ch);
     
     
       Checkbox ch1 = new Checkbox(" CHECKBOX--1 " , true);
       Checkbox ch2 = new Checkbox(" CHECKBOX--2 " , true);
        f1.setVisible(true);
       ch1.setBounds(250,250,100,100);
       ch2.setBounds(400,400,100,100);
       ch1.setBackground (Color.PINK);
       ch2.setBackground (Color.yellow);
       f.add(ch1);
       f.add(ch2);
     
       
       CheckboxGroup obj = new CheckboxGroup();
       Checkbox ch3 = new Checkbox(" CHECKBOX--ABCD " , obj,true);
       Checkbox ch4 = new Checkbox(" CHECKBOX--EFGH " , obj,true);
      ch3.setBounds(600,400,300,100);
       ch4.setBounds(800,400,300,100);
       f1.add(ch3);
       f1.add(ch4);
     
       
       Panel p =new Panel();
       p.add(b);
       p.add(ch1);
       p.add(ch2);
       p.setVisible(true);
       p.setBounds(500,600,100,100);
       p.setBackground (Color.CYAN);
       f.add(p);
     
     TextField t= new TextField(" TEXT FIELD TESTING...") ;
     t.setBounds(1000,350,300,50);
     t.setBackground (Color.ORANGE);
     t.setVisible(true);
     f.add(t);
     
     
      TextArea t1= new TextArea(" TEXT AREA TESTING...") ;
     t1.setBounds(350,350,150,150);
     t1.setVisible(true);
     f.add(t1);
     
     
     Label l7= new Label("LABEL 1");
     Label l5= new Label("LABEL 2");
     Label l6= new Label("LABEL 3");
     l7.setBounds(100,450,80,50);
     l7.setBackground(Color.PINK);
     
     l5.setBounds(100,490,80,50);
     l5.setBackground(Color.GREEN);
     
     l6.setBounds(100,530,80,50);
     l6.setBackground(Color.lightGray);
     
     f.add(l7);
     f.add(l5);
     f.add(l6);
     
    }
   
   
 }

public class Practical34{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         demo d = new demo();
    }
   
}

