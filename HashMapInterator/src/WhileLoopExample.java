import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WhileLoopExample {
	
	public static void main(String[] args) {
		//Create HashMap Object
		 HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		 //Adding items to HashMap
		 hashmap.put(1, "Ferrari");
		 hashmap.put(2, "McClaren");
		 hashmap.put(3, "Bugatti");
		 hashmap.put(4, "Rolls Royce");
		 hashmap.put(5, "Bentley");
		 
		 //before iteration 
		 System.out.println(hashmap);
		 
		 Iterator<Map.Entry<Integer, String>> iter = hashmap.entrySet().iterator();
		 
		 while(iter.hasNext()) {
			 Map.Entry<Integer, String> entry = iter.next();
			 System.out.println((entry.getKey() + 100) + " : " + entry.getValue().toUpperCase());
		 }
		 
	}

}
