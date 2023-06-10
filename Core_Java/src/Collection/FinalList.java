package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FinalList {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(4);
		l.add(2);
		System.out.println(l);
		
		Set<Integer> s=new HashSet<>(l);
		System.out.println(s);
//		
//		final List<Integer> l=new ArrayList<>();
//			l.add(1);
//			l.add(3);
//			l.add(5);
////		System.out.println(Collections.unmodifiableCollection(l));
//		l.add(7);
//		System.out.println(l);
//		List< Integer> l1=l;
//		l1.add(5);
//		System.out.println(l1);
		
		
		
	}
}
