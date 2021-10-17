class Account
{int x;
static int y;

public static void run()
{y=6;}
public void test()
{}

static class check
{public static String country = "INDI";
}
}

class Access
{public static void main(String[]  args)
{
Account a=new Account();
Account.run();
System.out.println(Account.check.country);
}
}
