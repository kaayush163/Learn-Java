class JavaExample {  
static final int ASCII_SIZE = 256; 
    static char getMaxOccuringChar(String str) 
    { 
        // Create array to keep the count of individual 
        // characters and initialize the array as 0 
        int count[] = new int[ASCII_SIZE]; 
       
        // Construct character count array from the input 
        // string. 
        int len = str.length(); 
        for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1;  // Initialize max count 
        char result = ' ';   // Initialize result 
       
        // Traversing through the string and maintaining 
        // the count of each character 
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
       
        return result; 
    } 
   static void countEachChar(String str) 
   { 
	//ASCII values ranges upto 256
	int counter[] = new int[256]; 

	//String length
	int len = str.length(); 

	/* This array holds the occurrence of each char, For example
	 * ASCII value of A is 65 so if A is found twice then 
	 * counter[65] would have the value 2, here 65 is the ASCII value
	 * of A
	 */
	for (int i = 0; i < len; i++) 
		counter[str.charAt(i)]++; 

	// We are creating another array with the size of String
	char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 

		/* If a char is found in String then set the flag 
		 * so that we can print the occurrence
		 */
		if (str.charAt(i) == array[j])  
			flag++;                 
	   } 

	   if (flag == 1)  
	      System.out.println("Occurrence of char " + str.charAt(i)
		 + " in the String is:" + counter[str.charAt(i)]);             
	} 
   } 
   public static void main(String[] args) 
   {  
      
        System.out.println("NAME=AAYUSH");
System.out.println("ROLL NO=18103003");
	String str = "sample string"; 
       System.out.println("Max occurring character is " + getMaxOccuringChar(str)); 
	countEachChar(str); 
   } 
}
