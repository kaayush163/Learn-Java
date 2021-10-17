class ThreadA extends Thread{
     public void run( ) {

        //creating two matrices    
      int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
      int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
      //creating another matrix to store the multiplication of two matrices    
      int c[][]=new int[3][3];  //3 rows and 3 columns  
    
      //multiplying and printing multiplication of 2 matrices   

  for(int i=0;i<3;i++)
   {    
      for(int j=0;j<3;j++)
     {    
        c[i][j]=0;      
      for(int k=0;k<3;k++)      
        {      
          c[i][j]+=a[i][k]*b[k][j];      
         }//end of k loop  

       System.out.print(c[i][j]+" ");  //printing matrix element  
      }//end of j loop  
     System.out.println();//new line  
     }
}
}

class ThreadB extends Thread {
    public void run( ) {
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers); 
System.out.println("The multiplication of two matrix is"); 
	}
}
class ThreadC extends Thread{
     public void run( ) {
            int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
         System.out.println(" ");
     }
}

class Demonstration_111 {
    public static void main(String args[]) {
System.out.println("NAME-AAYUSH");
System.out.println("ROLL NO-18103003");
         ThreadA a = new ThreadA();
         ThreadB b = new ThreadB();
         ThreadC c = new ThreadC();
         a.start();
         b.start();
         c.start();
         System.out.println("... Multithreading is going to start ");
    }
}