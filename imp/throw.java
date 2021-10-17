class done
{
public static void main(String[] args)
{
int balance=6000;
int withdrawl=5000;
try 
{
if(balance<withdrawl)
throw new ArithmeticException("Insufficient ");
balance =balance-withdrawl;
System.out.println("Transcation completed successfully");

}
catch(ArithmeticException e)
{System.out.println(e.getMessage());
}
System.out.println("Proceed further");
}
}