package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> l=new LinkedList<>();
		l.add("pran");
//		l.addLast();   //compile time error
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "pranali");
		hm.put(2, "amol");
		hm.put(3, "radhika");
		
//		hm.forEach((k,v)->System.out.println("key: "+k+", value: "+v));
		
		Iterator i=hm.keySet().iterator();
		while(i.hasNext()) {
			int key=(int) i.next();
			System.out.println("key: "+key+" value: "+hm.get(key));
		}
		
	}
}
