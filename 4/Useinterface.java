interface In1 
{ 
    // public, static and final 
    final int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        TestClass t = new TestClass(); 
        System.out.println("NAME:- AAYUSH");
        System.out.println("ROLL NO.:- 18103003");
        t.display(); 
        System.out.println(a); 
    } 
}