import java.io.*; 
import java.util.*; 
 
class Tokens 
{ 
    public static void main(String[] args) 
    { 
      
        System.out.println("NAME=AAYUSH");
System.out.println("ROLL NO=18103003");
         try 
        { 
            File file=new File("Armstrong.java"); 
            FileReader fr=new FileReader(file); 
            BufferedReader br=new BufferedReader(fr); 
            StringBuffer sb=new StringBuffer();             String line; 
            while((line=br.readLine())!=null) 
            { 
                sb.append(line); 
                sb.append("\n"); 
            } 
            fr.close(); 
            System.out.println("Contents of File: "); 
            System.out.println(sb.toString());             String string = sb.toString(); 
            int count; 
 
            string = string.toLowerCase(); 
            string = string.replaceAll("[^a-zA-Z0-9]", " "); 
 
            String words[] = string.split(" "); 
 
            System.out.println("Duplicate words in a given string : "); 
            for(int i = 0; i < words.length; i++) {                 count = 1; 
                for(int j = i+1; j < words.length; j++) { 
                    if(words[i].equals(words[j])) 
                    {                         count++;                         words[j] = "0"; 
                    } 
                } 
 
 
                if(count >= 1 && words[i] != "0") 
                    System.out.println(words[i] + "  -> count: " + count); 
            } 
        } 
        catch(IOException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
 } 
