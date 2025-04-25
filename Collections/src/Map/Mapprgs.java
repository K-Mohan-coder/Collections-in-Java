package Map;
import java.util.*;
public class Mapprgs {
	public static void main(String args[]) {
		
		//stores the values in the key,values pairs
		//key 
			//only allow only one null value
			//does not allow Duplicate values
		//Values
			//only allow more then one null value
			//allow Duplicate values
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "hi");
		map.put(2, "nan");
		map.put(3, "no");
		map.put(4, "to");
		map.put(5, "up");
		map.put(6, "go");
		
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println("Key : "+m.getKey()+" Value : "+m.getValue());
		}
	}
	
}
