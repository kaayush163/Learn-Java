interface Multiply{
   //abstract methods
   public abstract int multiplyTwo(int n1, int n2);
   
  
   int multiplyThree(int n1, int n2, int n3);
}

class Demo implements Multiply{
   public int multiplyTwo(int num1, int num2){
      return num1*num2;
   }
   public int multiplyThree(int num1, int num2, int num3){
      return num1*num2*num3;
   }
   public static void main(String args[]){
      Multiply obj = new Demo();
      System.out.println("NAME:- AAYUSH");
      System.out.println("ROLL NO.:- 18103003"); 

      System.out.println(obj.multiplyTwo(1, 4));
      System.out.println(obj.multiplyThree(3, 4, 5));
   }
}