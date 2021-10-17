class MultipleCatchBlocks 
{ 
public static void main(String[] args) 
{ System.out.println("NAME-AAYUSH"); 
System.out.println("ROLL NO-18103003");
try 
{ 
int a[]=new int[5]; 
a[5]=30/0; 
System.out.println(a[10]); 
} 
catch(ArithmeticException e) 
{ 
System.out.println("Arithmetic Exception occurs"); 
} 
catch(ArrayIndexOutOfBoundsException e) 
{ 
System.out.println("ArrayIndexOutOfBounds Exception occurs"); 
} 
catch(Exception e) 
{ 
System.out.println("Parent Exception occurs"); 
} 
System.out.println("rest of the code"); 
} 
} 