package String;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWord {
	public static void main(String[] args) {
		String s="I am am pranali java java";
		String s1[]=s.split(" "); //split words
		HashMap<String, Integer> hm=new HashMap<>();
		for(String temp:s1) {
			if(hm.get(temp)!=null) { //checks whether key value already present,if yes them it will not equal to null
				hm.put(temp, hm.get(temp)+1);
			}
			else
			hm.put(temp, 1);
		}
		System.out.println(hm);
		//if want only duplicate words to be printed then:
		Iterator<String> temp=hm.keySet().iterator();
		while(temp.hasNext()) {
			String temp1=temp.next();
		if(hm.get(temp1)>1) {
			System.out.println("Duplicate word "+temp1+" appeared "+ hm.get(temp1)+" times.");
			}
		}
	}
}
