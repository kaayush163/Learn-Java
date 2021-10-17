class THIS
{

int a,b;
THIS(int a,int b)
{
this.a = a;
this.b =b;
}
public static void main(String args[])
{
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
THIS obj = new THIS(2,5);
System.out.println("The value of variable obj are a = " + obj.a + " b = "+ obj.b);
}
}