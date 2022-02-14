package JavaPrograms;

import java.util.*;
public class Sortarraylist  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("Hyderabad");
	   listofcountries.add("Delhi");
	   listofcountries.add("Bengalore");
	   listofcountries.add("Chennai");

	   System.out.println("Before Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}

	   Collections.sort(listofcountries);
	  
	   System.out.println("After Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}
	}
}
