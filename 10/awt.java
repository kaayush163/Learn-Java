import java.awt.*; 
import java.awt.event.*; 
class MouseEvents extends Frame implements MouseListener, MouseMotionListener 
{ String msg=""; 
int mx=0,my=0; 
public MouseEvents()
 { addMouseListener(this); 
addMouseMotionListener(this); 
addWindowListener(new MyWindowAdapter());
 } 
public void mouseClicked(MouseEvent me)
 { mx = 100; 
my= 100; 
msg = "Mouse clicked.";
 repaint(); 
}
 public void mouseEntered(MouseEvent me) 
{ mx = 100; 
my = 100; 
msg = "Mouse entered."; 
repaint(); 
} 
public void mouseExited(MouseEvent me) { 
mx = 100; 
my = 100;
 msg = "Mouse exited.";
 repaint(); 
}
 public void mousePressed(MouseEvent me) 
{ mx = me.getX(); 
my = me.getY();
 msg = "Down";
 repaint();
 }
 public void mouseReleased(MouseEvent me)
 { mx = me.getX(); 
my = me.getY(); 
msg = "Up"; 
repaint(); }
 public void mouseDragged(MouseEvent me)
 { mx = me.getX(); 
my = me.getY();
 msg = "*"+"Dragging mouse at " + mx + ", " + my; 
repaint(); } 
public void mouseMoved(MouseEvent me)
 { msg="Moving mouse at " + me.getX() + ", " +me.getY(); 
repaint(); } 
public void paint(Graphics g) 
{ g.drawString("Aayush 18103003\n",100,200);
 g.drawString(msg, mx, my); } 
public static void main(String args[])
 { System.out.println("Aayush_18103003"); 
MouseEvents appwin=new MouseEvents();
 appwin.setSize(new Dimension(300,300)); 
appwin.setTitle("Mouse Event Demo"); 
appwin.setVisible(true); } 
}
 class MyWindowAdapter extends WindowAdapter 
{
 public void windowClosing(WindowEvent we){
 System.exit(0); 
}} 
