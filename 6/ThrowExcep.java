class ThrowsExecp 
{ 
static void fun() throws IllegalAccessException 
{ 
System.out.println("Inside fun(). "); 
throw new IllegalAccessException("demo"); 
} 
public static void main(String args[]) 
{ 
System.out.println("NAME-AAYUSH"); 
System.out.println("ROLL NO-18103003");
try 
{ 
fun(); 
} 
catch (IllegalAccessException e) 
{ 
System.out.println("caught in main."); 
} 
} 
} 
