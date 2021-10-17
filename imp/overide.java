class cars 
{int g;
public void gear(int x)
{g=x;
System.out.println("lets go");}
}

class superclass extends cars
{int g;
public void gear(int x)
{g=x;
System.out.println("lets rock");}
}

class check
{public static void main(String[] args)
{superclass s=new superclass();
s.gear(100);
}
}
