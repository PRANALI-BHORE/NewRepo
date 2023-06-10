package Java8.printEmployeeDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		List<String> l1=new ArrayList<String>();
		l1.add("pune"); l1.add("nasik");
		List<String> l2=new ArrayList<String>();
		l2.add("pune"); l2.add("goa");
		List<String> l3=new ArrayList<String>();
		l3.add("nasik"); l3.add("satara");
		List<String> l4=new ArrayList<String>();
		l4.add("pune");
		List<String> l5=new ArrayList<String>();
		l5.add("pune"); l5.add("nasik");
		list.add(new Employee(1, "Pranali", "E&TC", 45000, "Female", 29,l1));
		list.add(new Employee(2, "Pradnya", "IT",300000,"Female",28,l2));
		list.add(new Employee(3, "Amol", "Mechanical",500000,"Male",30,l3));
		list.add(new Employee(4, "Abhijeet", "E&TC",300000,"Male",34,l4));
		list.add(new Employee(5, "Rupali", "MCA",40000,"Female",39,l5));
		list.add(new Employee(2, "Pradnya", "IT",2000,"Female",28,l1));
		
//		System.out.println(list);
//		list.stream().filter(x->x.getAge()>=30).forEach(s->System.out.println(s));
//		list.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getAge)).forEach(s->System.out.println(s));
		//only names
//		list.stream().map(x->x.getName()).collect(Collectors.toSet()).forEach(x->System.out.println(x)); 
//		// only cities
//		List<List<String>> list1=list.stream().map(x->x.getCity()).collect(Collectors.toList()); 
//		System.out.println(list1);
//		//collect city without repeat
//		Set<String> list2=list.stream().flatMap(x->x.getCity().stream()).collect(Collectors.toSet());
//		System.out.println(list2);
//		//count occurance of name
//		Map<String, Long> m=list.stream().map(x->x.getName()).collect(Collectors.groupingByConcurrent(Function.identity() , Collectors.counting()));
//		System.out.println(m);
//		//max salary
//		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
//		System.out.println(max);
//		//min salary
//		Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getSalary));
//		System.out.println(min);
//		//2nd highest salary
//		Optional<Employee> findFirst = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//		System.out.println(findFirst);
		//no. of male and female
//		Map<String, Long> gender = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(gender);
		//all deparments 
//		Set<String> dep = list.stream().map(x->x.getDepartment()).collect(Collectors.toSet());
//		System.out.println(dep);
		//no.of employee in dep
//		Map<String, Long> empDep = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(empDep);
		//age more than 29
//		Map<String, Long> age = list.stream().filter(x->x.getAge()>29).collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
//		System.out.println(age);
		
		list.stream().filter(x->x.getAge()>30).forEach(x->System.out.println(x));
	}
}
