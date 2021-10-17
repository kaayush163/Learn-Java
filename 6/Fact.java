class Fact 
{ 
static int f(int a) 
{ 
int s=1; 
for(int i=1;i<=a;i++) 
{  
s=s*i; 
} 
return s; 
} 
public static void main(String args[]) 
{ 
System.out.println("NAME-AAYUSH"); 
System.out.println("ROLL NO-18103003"); 
int n,result; 
n=0; 
try 
{ 
n=Integer.parseInt(args[0]); 
if(n<0) 
throw new Exception("Negative number"); 
else 
{ 
result=f(n); 
System.out.println("Factorial is : "+result); 
} 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
} 