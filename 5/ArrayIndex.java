class Demo { 
public static void main(String args[]) 
    { 
            System.out.println("Name: AAYUSH");
        System.out.println("Roll number: 18103003");
        try { 
            int a[] = new int[5]; 
            a[6] = 9;
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Array Index is Out Of Bounds"); 
        } 
    } 
}
