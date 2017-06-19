package default;
import java.util.*;
import java.io.*;

public class SpellCheck {

    public static void main(String[] args) {
      ArrayList<String> stringArray = new ArrayList<>();
      ArrayList<String> stringArray2 = new ArrayList<String>();
     try{
    String filename = new String("SpellCheck/Test.txt");
    Scanner scan = new Scanner(new File(filename));
    Scanner scan2 = new Scanner(System.in);
    Map<String, Integer> map = new TreeMap<String, Integer>();
    int count = 0;
    while(scan.hasNext()){
        String d = scan.nextLine();
        System.out.println(d);
        System.out.println("does this look spelled right? Y or N ?");
        String g = scan2.next();
        if(g.equalsIgnoreCase("Y")){
            System.out.println("It is correct");
            stringArray2.add(d);
        }else{
            System.out.println("Please enter the correct spelling");
            String f = scan2.next();
            stringArray.add(f);
            count++;
            map.put(f, count);
            
        }
    } System.out.println("please check the  following spelling ");
      for(Map.Entry<String,Integer> entry : map.entrySet()){
          String f = entry.getKey();
          System.out.println(f);
          System.out.println("Is this word correct? Y or N");
          String next = scan2.next();
          if(next.equalsIgnoreCase("Y")){
              System.out.println("It is correct");
              stringArray2.add(f);
          }else if(next.equalsIgnoreCase("N")){
              stringArray2.remove(f);
          }
         
      } 
      System.out.println(stringArray2.size());
      for(String s: stringArray2){
          System.out.print(s + " ");
      }
    
    }catch(FileNotFoundException e){
        System.out.println("not found");
    }

               
    }
        
       
      
}
