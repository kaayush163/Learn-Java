import java.awt.*;
 import java.awt.event.*; 
class AnonymousDemo extends Frame 
{
 String msg=""; 
int mx=100,my=100; 
public AnonymousDemo() 
{
 addMouseMotionListener(new MouseMotionAdapter() 
{
 public void mouseMoved(MouseEvent me) 
{
 msg="Moving mouse at " + me.getX() + ", " +me.getY();
 repaint(); 
}
 public void mouseDragged(MouseEvent me) 
{
 mx = me.getX(); 
my = me.getY(); 
msg = "*"+"Dragging mouse at " + mx + ", " + my; 
repaint();
 } 
}); 
addWindowListener(new WindowAdapter(){
 public void windowClosing(WindowEvent we)
{ System.exit(0);
 }
 });
} 
public void paint(Graphics g) 
{
 g.drawString("Aayush 18103003\n",100,200);
 g.drawString(msg, mx,my); 
} 
public static void main(String args[])
 {
 System.out.println("Aayush_18103003"); 
AnonymousDemo appwin=new AnonymousDemo();
 appwin.setSize(new Dimension(500,500)); 
appwin.setVisible(true); 
} }
