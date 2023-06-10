package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListOfList {
	public static void main(String[] args) {
		List<List<String>> list= Arrays.asList(Arrays.asList("pratik"),Arrays.asList("lalit"),Arrays.asList("lokesh"),Arrays.asList("abhinav"));
		List<String> flatMap = list.stream().flatMap(x->x.stream()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(flatMap);
		
	}
}
