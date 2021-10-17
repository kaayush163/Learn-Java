class WrongAccountException extends Exception{
   public WrongAccountException (String msg){
      super(msg);   
 }
}
class InsufficientBalanceException extends Exception{
   public InsufficientBalanceException(String msg){
      super(msg);   
  }
}
class Customer{
  int  account,balance;
  String name;
   public Customer(double acc,int bal,String name){
     try{
     if(Math.floor(acc)!=acc){
         throw new WrongAccountException("WrongAccountException");
      }
      }
      catch(WrongAccountException e){
         System.out.println(e);
       }
     account=(int)acc;
     balance=bal;
     this.name=name;
   }
    public void WithdrawOrDeposit(int account,int amount,int code){
       if(code==0){
          balance-=amount;
       try{  
        if(balance<100){
            throw new InsufficientBalanceException("InsufficientBalanceException");  
          }
         }
      catch(InsufficientBalanceException e){
         System.out.println(e);
       }
           System.out.println("Deducted Rs."+amount+" from "+name+" 's balance");
      }else{
           balance+=amount;
           System.out.println("Added Rs."+amount+" to "+name+" 's balance");
       }
  }
}
class Question1{
static Customer[] custdata=new Customer[10];  
public static void main(String[] args){
System.out.println("NAME-AAYUSH");
System.out.println("ROLL NO-18103003");
    custdata[0]=new Customer(1.1,111,"aman");
    custdata[1]=new Customer(2,69,"khandelwal");
    custdata[2]=new Customer(3,10,"aditya");
    custdata[3]=new Customer(4,1000,"aayush");
    custdata[4]=new Customer(5,105,"rajat singh");
    custdata[5]=new Customer(6,1,"Nitish");
    custdata[6]=new Customer(7,111,"archit");
    custdata[7]=new Customer(8,25,"aviral");
    custdata[8]=new Customer(9,1000000,"abhishek");
    custdata[9]=new Customer(10,600,"noname");
    printdata();
    custdata[5].WithdrawOrDeposit(6,550,1);
    custdata[4].WithdrawOrDeposit(5,155,0);
    custdata[3].WithdrawOrDeposit(4,29,1);
    custdata[5].WithdrawOrDeposit(6,550,1);
 }
  public static void printdata(){
     for(int i=0;i<10;i++){
     if(custdata[i].balance<100){ 
      System.out.println("Name->"+custdata[i].name+"\n"+"Account NO.->"+custdata           [i].account+"\n"+"Balance->"+custdata[i].balance);
 }}
 }
  
}