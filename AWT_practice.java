/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_practice;
import java.awt.*;


/**
 *
 * @author PRIYA ANU
 */
public class AWT_practice {
  AWT_practice()
          {
              Frame f= new Frame();
              f.setBackground(Color.CYAN);
              f.setSize(900,900);
              f.setTitle("My first AWT");
              f.setVisible(true);
              f.setLayout(null);
              
              Label l1= new Label(" I am LABEL 1 ");
              l1.setBackground(Color.WHITE);
              Label l2= new Label(" I am LABEL 2 ");
              l2.setBackground(Color.WHITE);
              Label l3= new Label(" I am LABEL 3 ");
              l3.setBackground(Color.WHITE);
              
              l1.setBounds(50,300 ,99, 40);
              l2.setBounds(50,360 ,99, 40);
              l3.setBounds(50,410 ,99, 40);
              
              f.add(l1);
              f.add(l2);
              f.add(l3);
              
              List list= new List();
             
              list.add(" List 1 ");
              list.add(" List 2 ");
              list.add(" List 3 ");
              list.add(" List 4 ");
              list.add(" List 5 ");
              list.add(" List 6 ");
             list.add (" List 7 ");
              
              list.setBounds(250,300 ,200,40);
              f.add(list);
              list.setBackground(Color.PINK);
              
              
              Checkbox p = new Checkbox(" ABC ",true);
              Checkbox p1 = new Checkbox(" DEF ",true);
              p.setBounds(170,230,50,30);
              p1.setBounds(170,260,50,30);
              f.add(p);
              f.add(p1);
               p.setBackground(Color.LIGHT_GRAY);
               p1.setBackground(Color.LIGHT_GRAY);
                
             Panel pa=new Panel() ;
             pa.setBackground(Color.ORANGE);
             pa.setBounds(600,300,200,200);
             f.add(pa);
             pa.add(p);
             pa.add(p1);
             pa.add(list);
             
             Button b=new Button(" CLICK ") ;
             b.setForeground(Color.ORANGE);
             b.setBackground(Color.BLACK);
             b.setBounds(350,600,200,200);
             f.add(b);
             
             
            
            
          }
public static void main(String[] args) {
        
             AWT_practice s57= new AWT_practice() ;  
    }
    
}

