package pack1;
public class tester
{ 
 public void display() 
 { 
 System.out.println("Iam demonstrating public specifiers"); 
 } 
 protected void display1() 
 { 
 System.out.println("Iam demonstrating protected specifiers"); 
 } 
} 
class tester2
{
void displaydef()
{
System.out.println("Iam demonstrating Default");
} }
package pack2;
import pack1.*;
public class tester1 extends tester
{
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("AAYUSH");
System.out.println("18103003");
 tester T= new tester();
 T.display();
 tester1 T1= new tester1();
 T1.display1();
 
 
} }
class test
{
tester2 T2 = new tester2();
T2.display();
}