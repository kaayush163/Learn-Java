class Do
{ 
public static void main(String[] args){
try
{System.out.println("In just"+3/0);
System.out.println("wow");
}
catch(ArithmeticException e)
{
System.out.println("Exception"+e.getMessage());
}
System.out.println("Hello");
}
}
