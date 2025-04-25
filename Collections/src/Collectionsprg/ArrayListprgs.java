package Collectionsprg;
import java.util.*;

public class ArrayListprgs {
	
	public static void main(String args[]) {
		List a1 =  new ArrayList();
		
		System.out.println("Adding");
		a1.add(12);
		a1.add("hi");
		a1.add(34.4);
		
		System.out.println();
		System.out.println("Getting");
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		 System.out.println();
		 System.out.println("Inserting");
		 
		 a1.add(0, 3);
		 System.out.println(a1.size());
		 
		 System.out.println();
		 System.out.println("Removing");
		 a1.remove(2);
		 
			for(int i=0;i<a1.size();i++) {
				System.out.println(a1.get(i));
			}
			
		 System.out.println("Size : "+a1.size());
		 
		 
		 //add - add the values by pushing the previous values down
		 //addall - is used to add the all values of a object  in next next index
		 //get - to the values of ArrayList by the index
		 //remove - remove the values by index
		 //set  - replace the value
		 //it allows duplicate value
		 //it will allow null values
		 //stores different types of data
			//Non-synchronized
			//it maintains insertion order 
		 //sorting and searching faster
		 //manipulation slow because to shift all the element when we add new element

		 
		
	}

}
