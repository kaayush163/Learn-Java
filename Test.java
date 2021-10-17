class Test {

   public static void main(String args[]) {
      int a = 56;	
      int b = 13;	
      int c = 0;
      
       System.out.println("Name: AAYUSH");
       System.out.println("Roll No:18103003");
      c = a & b;        
      System.out.println("a & b = " + c );

      c = a | b;       
      System.out.println("a | b = " + c );

      c = a ^ b;        
      System.out.println("a ^ b = " + c );

      c = ~a;          
      System.out.println("~a = " + c );

      c = a <<2;
      System.out.println("a << 2 = " + c );

      c = a >> 2;       
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;     
      System.out.println("a >>> 2 = " + c );
   }
}