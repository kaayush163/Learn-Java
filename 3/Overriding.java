class A 
{ 
    void m1() 
    { 
        System.out.println("A's m1 method"); 
    } 
} 
  
class B extends A 
{ 
    void m1() 
    { 
        System.out.println(" B's m1 method"); 
    } 
} 
  
class C extends A 
{ 
   
    void m1() 
    { 
        System.out.println("C's m1 method"); 
    } 
} 
  
class Dispatch 
{ 
    public static void main(String args[]) 
    { 
       System.out.println("Name=AAYUSH");
       System.out.println("Roll No=18103003");
        A a = new A(); 
  
     
        B b = new B(); 
  
      
        C c = new C(); 
  
       
        A ref; 
          
        
        ref = a; 
  
        // calling A's version of m1() 
        ref.m1(); 
  
      
        ref = b; 
  
        // calling B's version of m1() 
        ref.m1(); 
  
     
        ref = c; 
  
        // calling C's version of m1() 
        ref.m1(); 
    } 
} 