package Collection;

import java.util.HashMap;

public class hashmap_bajajFinserve {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("A",3);
		
		System.out.println(map.get("A"));
	}
}
