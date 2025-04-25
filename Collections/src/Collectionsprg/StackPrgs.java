package Collectionsprg;
import java.util.*;

public class StackPrgs {
	
	public static void main(String args[]) {
		//Pop()
		//peek()
		//push()
		//empty()-to check whether it is empty or not
		//It is based on the Last-in-first-out
		//LIFO
		//allows duplicate values
		//non-synchronized
		Stack<Integer> s =new Stack<>();
		s.push(6);
		s.push(8);
		
		//Adding
		System.out.println(s.peek());
		System.out.println();
		for(Integer v:s) {
			System.out.println(v);
		}
	}

}
