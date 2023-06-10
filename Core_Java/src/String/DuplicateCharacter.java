package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s="pranali";
		Set<Character> set=new HashSet();
		Arrays.asList(s).stream().filter(i->set.add(s.charAt(i))).collect(Collectors.toList());
		
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
		System.out.println(hm);
		sum(new int[] {2,6,2});
	}
	
	public static void sum(int[] a) {
		int total=0;
		for(int i:a)
			total=total+i;
		System.out.println("total: "+total);
	}
}
