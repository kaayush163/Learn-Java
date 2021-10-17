class Office {
  int empno;
  String empname;
  int salary;

  Office(int empno, String empname, int salary) {
    this.empno = empno;
    this.empname = empname;
    this.salary = salary;
  }

  void getValue() {
    System.out.println("\nEmployee No. : " + empno + "\nEmployee Name : " + empname + "\nSalary : " + salary);
  }
}

class Teaching extends Office {
  String designation;

  Teaching(int empno, String empname, int salary) {
    super(empno, empname, salary);
  }

  void setValue(String designation) {
    this.designation = designation;
  }

}

class NonTeaching extends Office {
  String designation;

  NonTeaching(int empno, String empname, int salary) {
    super(empno, empname, salary);
  }

  void setValue(String designation) {
    this.designation = designation;
  }
}

class Program1 {
  public static void main(String[] args) {

     System.out.println("Name: AAYUSH");
        System.out.println("Roll number: 18103003");

    Teaching t1 = new Teaching(11, "Sam", 25000);
    t1.setValue("Teaching Assistant");
    t1.getValue();

    NonTeaching nt1 = new NonTeaching(12, "John", 30000);
    nt1.setValue("Research Assistant");
    nt1.getValue();
  }
}