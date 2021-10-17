class Car
{
   final int speedlimit=100;
   void race()
    {
        int speedlimit=400;
    }
   final void run()
    {
        System.out.println("running");
    }
}

class SuperCar extends Car
{
    void run()
    {
       System.out.println("running safely with 100kmph");
    }
} 

final class Bike{}

class SuperBike extends Bike
{
    void run1()
    {
       System.out.println("running safely with 100kmph");
    } 
}
class SuperExample
{
    public static void main(String [] args)
     {
         System.out.println("NAME-Aayush");
         System.out.println("ROLL NO-18103003");

         //Final Variable
         Car c = new Car();
         c.race();                  //Compile Time Error
       //There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed

        //Final Function
        SuperCar c1 = new SuperCar();
        c1.run();                //Compile Time Error
        //If you make any method as final, you cannot override it
         
       //Final Class
        SuperBike b1 = new SuperBike();
        b1.run1();             //Compile Time Error
        // If you make any class as final, you cannot extend it
     }
}