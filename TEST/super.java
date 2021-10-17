class Programming { 
    
    
    public Programming() 
    { 
        System.out.println("Programming"); 
    } 
  
    // Parameterized Constructor 
    public Programming(int i, int j) 
    { 
        System.out.println("Programming + +"); 
    } 
} 
  

class DP extends Programming { 
    
    public DP() 
    { 
        
        super(10, 20); 
        System.out.println("DP"); 
    } 
  
    // Parameterized Constructor 
    // for class DP 
    public DP(int i, int j) 
    { 
        System.out.println("DP + +"); 
    } 
} 
  
class GFG { 
    public static void main(String[] args) 
    { 
        // Creating Obect for class DP. 
        DP obj = new DP(); 
    } 
}