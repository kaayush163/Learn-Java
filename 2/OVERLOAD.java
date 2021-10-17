class Overload
{
  int a,b;
  Overload()
  {
    a=1;
    b=1;
   }
  Overload(int a,int b)
   {
    this.a = a;
    this.b = b;
    }
  Overload(int a)
   {
   this.a = a;
   this.b = 5;
   }
  void method(int a)
   {
   System.out.println("Method1 invoked");
   }
   void method(int a, int b)
  {
   System.out.println("Method2 invoked");
   }
public static void main(String args[])
{
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
Overload obj1 = new Overload(2,3);
Overload obj2 = new Overload(2);
System.out.println("The values of obj1 is a = " + obj1.a + " b = " + obj1.b);
System.out.println("The values of obj2 is a = " + obj2.a + " b = " + obj2.b);
obj1.method(3);
obj1.method(1,2);
}
}