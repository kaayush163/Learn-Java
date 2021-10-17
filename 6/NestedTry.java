class NestedTryDemo 
{ 
public static void main(String[] args) 
{ 
System.out.println("NAME-AAYUSH"); 
System.out.println("ROLL NO-18103003");

try 
{ 
System.out.println("In Outer try block"); 
try 
{ 
System.out.println("In Inner try block"); 
int a = 7 / 0; 
} 
catch (IllegalArgumentException e) 
{ 
System.out.println("IllegalArgumentException caught"); 
} 
finally 
{ 
System.out.println("In Inner finally");  
} 
} 
catch (ArithmeticException e) 
{ 
System.out.println("ArithmeticException caught"); 
} 
finally 
{ 
System.out.println("In Outer finally"); 
} 
} 
} 
