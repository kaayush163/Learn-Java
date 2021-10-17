class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     
notify();  
    // try{  
     // Thread.sleep(400);  
     //}catch(Exception e){System.out.println(e);} 
                        }   
     }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){ 

t.printTable(5);  
   }  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public  void run(){ 
 
t.printTable(100);  
}  
}  
  

class Test{  
     public static void main(String args[]){ 
System.out.println("NAME=Aayush");
System.out.println("ROLL No=18103003"); 
     Table obj = new Table();//only one object  
     MyThread1 t1=new MyThread1(obj); 

      MyThread2 t2=new MyThread2(obj); 
 
       t1.start();  
       

      synchronized(t1){
                        try{
                             System.out.println("Waiting for t1 to complete...");
                                t1.wait();
                           }catch(InterruptedException e){
                                  System.out.println(e);
                                  }
                       }
          t2.start();
       synchronized(t2){
                           try{
                                System.out.println("Waiting for t2 to complete...");
                                t2.wait();
                               }catch(InterruptedException e){
                            System.out.println(e);
                                 }
                         }
          }
}

  