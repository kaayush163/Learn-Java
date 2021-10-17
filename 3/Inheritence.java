class A{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class Single extends A{
    int b = 20;
    void showB() {
        System.out.println("b = "+b);
    }
public static void main(String[] args) {
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");

        Single e = new Single();
        e.show();
        
    }

}

class Hierarical extends A{
    
    public static void main(String[] args) {
System.out.println("Name=AAYUSH");
System.out.println("Roll No=18103003");

        C c = new C();
        c.show();
        Single b = new Single();
        b.show();
    }
}

class Multilevel extends Single{
    
public static void main(String[] args) {
    Multilevel d = new Multilevel();
    d.showB();  
    }
}
    