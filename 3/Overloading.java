class Overloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }

   public static void main(String args[])
   {
      System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
       Overloading obj = new Overloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}