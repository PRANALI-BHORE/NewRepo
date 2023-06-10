package Java8;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {
		String s="pranali";
		Map<Character, Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i))){
				int count=m.get(s.charAt(i));
				m.put(s.charAt(i), ++count);
			}else {
				m.put(s.charAt(i), 1);
			}
			
		}
		System.out.println(m);
	}

}