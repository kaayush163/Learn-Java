class Flower{     
                       //super is used to refer immediate parent class instance variable.
String color="white";  
}  
class Rose extends Flower{  
String color="black";  
void printColor(){  
System.out.println(color); 
System.out.println(super.color); 
}  
}  
class TestSuper1{  
public static void main(String args[]){  
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
System.out.println("super is used to refer immediate parent class instance variable");
Rose d=new Rose();  
d.printColor();  
}}  




class Animal{  
                                   //super can be used to invoke parent class method
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){ 
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
System.out.println("super can be used to invoke parent class method"); 
Dog d=new Dog();  
d.work();  
}}  



class Animal1{  
                                        // super is used to invoke parent class constructor.
Animal1(){System.out.println("animal is created");}  
}  
class Dog1 extends Animal1{  
Dog1(){  
super();  
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");
System.out.println(" super is used to invoke parent class constructor");
Dog1 d=new Dog1();  
}}  