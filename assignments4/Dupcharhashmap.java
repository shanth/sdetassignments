package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class 1Dupcharhashmap{
 
  public void countDupChars(String str){
 
    
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    
    char[] chars = str.toCharArray();
 
   
    for(Character ch:chars){
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }
 
   
    Set<Character> keys = map.keySet();
 
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
  }
 
  public static void main(String a[]){
	  Dupcharhashmap obj = new Dupcharhashmap();
    System.out.println("String: PRATAP.VIRAT");
    System.out.println("-------------------------");
    obj.countDupChars("PRATAP.VIRAT");
  
    System.out.println("\nString: Broadridge");
    System.out.println("-------------------------");
    obj.countDupChars("Broadridge");
 
    System.out.println("\nString: #@$@!#$%!!%@");
    System.out.println("-------------------------");
    obj.countDupChars("#@$@!#$%!!%@");
  }
}
