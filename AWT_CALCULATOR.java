
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_calculator;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PRIYA ANU
 */


public class AWT_CALCULATOR implements ActionListener
  {

    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    
     Button b1=new Button("Add");
     Button b2=new Button("Subtract");
     Button b3=new Button("Multiplication");
     Button b4=new Button("Division");
     
   AWT_CALCULATOR(){
        Frame f=new Frame();
        f.setVisible(true);
        f.setLayout(null);
        
        Label l1=new Label("Calculator ");
        Label l2=new Label("First number: ");
        Label l3=new Label("Second number: ");
        Label l4=new Label("Result:");
  
        l1.setBounds(300,10,200,300);
   
        l2.setBounds(100,240,200,50);
        l3.setBounds(100,310,200,50);
        l4.setBounds(100,380,200,50);
        
        t1.setBounds(600,250,50,30);
        t2.setBounds(600,325,50,30);
        t3.setBounds(600,390,50,30);
      
        b1.setBounds(250,480,200,100); 
        b1.addActionListener(this);
        b2.setBounds(500,480,200,100); 
        b2.addActionListener(this);
        b3.setBounds(250,600,200,100); 
        b3.addActionListener(this);
        b4.setBounds(500,600,200,100); 
        b4.addActionListener(this);
       
        f.setSize(900,900);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e){
        
            
        try{
             
             
            if(e.getSource()== b1){  // in case of multiple buttons, to track the button pressed use the getSource method
                int  no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                int ans=no1+no2;
                String a=Integer.toString(ans);
                t3.setText(a);  // as only accepts string value 
            }
            
             if(e.getSource()== b2){
                int  no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                int ans=no1-no2;
                String a=Integer.toString(ans);
                t3.setText(a);
            }
             
              if(e.getSource()== b3){
                int  no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                int ans=no1*no2;
                String a=Integer.toString(ans);
                t3.setText(a);
             
            }
               if(e.getSource()== b4){
                int  no1=Integer.parseInt(t1.getText());
                int no2=Integer.parseInt(t2.getText());
                float ans=no1/no2;
                String a=Float.toString(ans);
                t3.setText(a);
            }
           
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
          }
         System.out.println(e.getActionCommand()); // which action performed
             System.out.println(e.getSource());
             System.out.println(e.getWhen());// when ??
             System.out.println(e.getModifiers());  // type of modifier  
     }
    
    public static void main(String[] args){
        AWT_CALCULATOR a=new AWT_CALCULATOR();
    }
    
}


    
    