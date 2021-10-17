import java.awt.*;
 import java.awt.event.*; 
import javax.swing.*;
class gui extends JFrame 
{
 JLabel l,l1,l2,l3,l4; 
JButton b1,b2;
 JTextField t1,t2,t3;
 gui() 
{ l=new JLabel(" addition of two numbers ");
 l4=new JLabel(" Aayush 18103003");
 l1=new JLabel("enter number 1 ");
 l2=new JLabel(" enter number 2 "); 
l3=new JLabel("sum of two numbers "); 
b1=new JButton("Sum"); 
b2=new JButton("clear");
 t1=new JTextField(10); 
t2=new JTextField(10); 
t3=new JTextField(10); 
add(l); 
add(l4); 
add(l1); 
add(t1); 
add(l2); 
add(t2); 
add(l3); 
add(t3); 
add(b1); 
add(b2);
 l3.setVisible(false);
 t3.setVisible(false);
 b1.addActionListener( 
new ActionListener(){
 public void actionPerformed(ActionEvent ae) 
{
 float a,b,c;
 if(ae.getSource()==b1)
 {
 a=Float.parseFloat(t1.getText());
 b=Float.parseFloat(t2.getText());
 c=a+b;
 t3.setText(String.valueOf(c));
 l3.setVisible(true);
 t3.setVisible(true); 
}
 } 
} ); 
b2.addActionListener( 
new ActionListener()
{ public void actionPerformed(ActionEvent ae) 
{
 t1.setText(" ");
 t2.setText(" ");
 t3.setText(" ");
 } }
);
 setSize(300,300); 
setLayout(new FlowLayout()); 
setTitle("adder");
 addWindowListener(new MyWindowAdapter()); 
}
 public static void main(String args[]) 
{
 gui a=new gui(); 
a.setVisible(true);
 a.setLocation(200,200); 
}
 } 
class MyWindowAdapter extends WindowAdapter 
{
 public void windowClosing(WindowEvent we){
 System.exit(0); 
}}
