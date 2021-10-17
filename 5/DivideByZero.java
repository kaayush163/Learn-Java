class Exc{
 public static void main(String args[]){
try{
int d=0;
int a = 42/d;
System.out.println("this will not be printed");
}
catch(ArithmeticException e){
System.out.println("name : AAYUSH");
System.out.println("roll no: 18103003");
System.out.println("division by zero");
}
System.out.println("after handling exception statement");
}
}