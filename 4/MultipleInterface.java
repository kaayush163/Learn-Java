interface PeopleEat {
   void eat();
}
interface PeopleTravel {
   void travel();
}
class People implements PeopleEat, PeopleTravel {
   public void eat() {
      System.out.println("People is eating");
   }
   public void travel() {
      System.out.println("People is travelling");
   }
}
class Demo {
   public static void main(String args[]) {
System.out.println("NAME=AAYUSH");
		System.out.println("ROLL NO=18103003");
      People a = new People();
            a.eat();
      a.travel();
   }
}