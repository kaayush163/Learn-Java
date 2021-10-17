class Refernce{
 int a=50;

 void change(Refernce op){
 op.a=op.a+100;
 }


 public static void main(String args[]){
  System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
 Refernce op=new Refernce();

 System.out.println("before change "+op.a);
 op.change(op);
 System.out.println("after change "+op.a);

 }
} 