package mypack1; 
  
public class ClassOne { 
    public void methodClassOne() { 
        System.out.println("Hello there its ClassOne"); 
    } 
}
package mypack2;
import mypack1.ClassOne; 
  
class Testing 
{ 
    public static void main(String[] args){ 

         System.out.println("Name: AAYUSH");
        System.out.println("Roll number: 18103003");
        
        ClassOne b = new ClassOne(); 
        b.methodClassOne(); 
    } 
}