class Sumofarray{
   public static void main(String args[]){

     System.out.println("NAME:AAYUSH");
     System.out.println("Roll no:18103003");
      int[] array = {10, 20, 30, 40, 50, 10};
      int sum = 0;
      
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}