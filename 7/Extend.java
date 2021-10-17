class Mult extends Thread {

	public void run() {
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

class PrimeNumbers extends Thread
{

   public void run2()
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 100000; i++)         
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
       System.out.println("Prime numbers from 1 to 100000 are :");
       System.out.println(primeNumbers);
   }

}

class GCD extends Thread {


    public void run3() {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}

class ThreadClassDemo {
	public static void main(String[] args) {
		
		PrimeNumbers t2 = new PrimeNumbers();
		GCD t3 = new GCD();
                 Mult t1 = new Mult();
		
		t2.start();
		t3.start();
                t1.start();

	}
}