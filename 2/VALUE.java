class Value{
 int a=50;

 void change(int a){
 a=a+100;
 }

 public static void main(String args[]){
  
  System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
 Value op=new Value();

 System.out.println("before change "+op.a);
 op.change(500);
 System.out.println("after change "+op.a);

 } 
}

