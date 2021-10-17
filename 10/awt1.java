 import java.awt.*;
 import java.awt.event.*; 
class KeyEvents extends Frame implements KeyListener
 { String msg=""; 
int mx=0,my=0; 
public KeyEvents() 
{ addKeyListener(this);
 addWindowListener(new MyWindowAdapter()); } 
public void keyPressed(KeyEvent e) 
{ mx = 100;
 my= 100; 
msg = "Key Pressed."; 
repaint(); } 
public void keyReleased(KeyEvent me) 
{ mx = 100; 
my = 100; 
msg = "Key Resleased"; 
repaint(); } 
public void keyTyped(KeyEvent e) 
{ mx = 100; 
my = 100;
 msg = "Key typed.";
 repaint(); }
 public void paint(Graphics g)
 {
 g.drawString("Aayush 18103003\n",100,200);
g.drawString(msg, mx, my); } 
public static void main(String args[]) 
{
 System.out.println("Aayush_18103003");
 KeyEvents appwin=new KeyEvents();
 appwin.setSize(new Dimension(300,300));
 appwin.setTitle("Key Event Demo");
 appwin.setVisible(true); 
}}
 class MyWindowAdapter extends WindowAdapter 
{
 public void windowClosing(WindowEvent we){
 System.exit(0);
 } }
