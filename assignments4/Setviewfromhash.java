package JavaPrograms;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

class Setviewfromhash{

  public static void main(String args[]) {
 
    HashMap<String, String> hmap = new HashMap<String, String>(); 
 
    hmap.put("Key1", "ABC");
    hmap.put("Key2", "DEF");
    hmap.put("Key3", "GHI");
    hmap.put("Key4", "JKL");
    hmap.put("Key5", "MNOP");
 
    Set<String> keys = hmap.keySet();

    System.out.println("Set of Keys contains: ");
 
    Iterator<String> it = keys.iterator();
    
    while(it.hasNext()){
       System.out.println(it.next());
    } 
  }
}