class BreakContinue {
 
    public static void main(String args[]) {
   

        System.out.println("NAME:AAYUSH");
        System.out.println("ROLL NO:18103003");

        int[] numbers= new int[]{100,18,21,30};
     
        OUTER: 
        for(int i = 0; i<numbers.length; i++){
            if(i % 2 == 0){
                System.out.println("Odd number: " + i + ", continue from OUTER label");
                continue OUTER;
            }
         
            INNER:
            for(int j = 0; j<numbers.length; j++){
                System.out.println("Even number: " + i + ", break  from INNER label");
                break INNER;
            }
        }
     
    }
}
