class RetOBJ
{
int a,b;
RetOBJ(int x,int y)
{
a=x;
b=y;
}
double area()
{
return (a*b);
}
public static void main(String args[])
{System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
RetOBJ obj1 = new RetOBJ(2,5);
System.out.println("The sides of rectangle are length = " + obj1.a + "breadth = "+ obj1.b);
System.out.println("Area of rectangle = " + obj1.area());
}
}