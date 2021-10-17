abstract class Base { 
    Base() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derived extends Base { 
    Derived() { System.out.println("Derived Constructor Called"); } 
    void fun() { System.out.println("Derived fun() called"); } 
} 
class Main { 
    public static void main(String args[]) { 
     System.out.println("NAME:- AAYUSH");
      System.out.println("ROLL NO.:- 18103003"); 
            Derived d = new Derived();
    } 
}