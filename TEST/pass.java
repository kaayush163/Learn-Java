import javax.swing.JOptionPane;

 class Validation {   

    static String password;

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a given  password : ");
    String passwordhere = in.nextLine();
    System.out.print("Please re-enter the password to confirm : ");
    String confirmhere = in.nextLine();
    System.out.println("your password is: " + passwordhere);

    while (!passwordhere.equals(confirmhere) || !isValid(passwordhere)) {
        System.out.println("The password entered here  is invalid");
        System.out.print("Please enter the password again.it must be valid : ");
        String Passwordhere = in.nextLine();
        System.out.print("Please re-enter the password to confirm : ");

 public static boolean IsValidInput(String s) {

     boolean status = false;    
     char [] array = s.toCharArray();
     int lower=0, upper=0, digits=0;

     if (s.length() > 8) 
     status = true;

      for ( int i = 0;  i < array.length; i++) {
       if(Character.isDigit(array[i]))
          digits++;
       if(Character.isLowerCase(array[i]))
          lower++;
       if(Character.isUpperCase(array[i]))
          upper++;
     }

       if ( !(lower  > 0 ))
       status = false;

       if ( !(upper  > 0 ))
       status = false;

       if ( !(digits > 0 ))
       status = false;

       return status;
     }     

     public static void  setPassword(String p) {
     if (IsValidInput(p)) {
      password = p;
     JOptionPane.showMessageDialog( null, " Your Password is accepted -" + p);
     }

     else {
     password ="";
     JOptionPane.showMessageDialog( null, " Your  Password is  not accepted -" + p);
     }
     }

    }