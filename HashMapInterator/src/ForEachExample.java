import java.util.HashMap;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		//creating HashMap object
		HashMap<Integer, String> hashmap = new HashMap <Integer, String>();
		
		//adding items to HashMap
		hashmap.put(1, "Apples");
		hashmap.put(2, "Oranges");
		hashmap.put(3, "Pears");
		hashmap.put(4, "Grapes");
		
		//HashMap before iteration
		System.out.println(hashmap);
		
		//HashMap after iteration
		hashmap.forEach((key,value)-> System.out.println(key + " : " +(value.toUpperCase())));
		
		
		
		
	}

}
