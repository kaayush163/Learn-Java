class A
{
	A()
	{
		System.out.println("constructor A is called");
	}
	
}

class B extends A
{
	int x;
	static int  b;
	static
	{
		b=20;
		System.out.println("Static Block is called value of b="+ b);
	}
	
	B()
	{super();
		System.out.println("Constructor B is called");
	}
	{x=5;
	 System.out.println("value of x="+ x);
	}
}
class Constructor {

	public static void main(String[] args) {
		

		System.out.println("NAME=AAYUSH");
		System.out.println("ROLL NO=18103003");
       B b= new B();
	}

}