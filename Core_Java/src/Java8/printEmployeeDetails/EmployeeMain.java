package Java8.printEmployeeDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "Pranali", "E&TC",1000,"Female",29));
		list.add(new Employee(2, "Pradnya", "IT",20000,"Female",28));
		list.add(new Employee(3, "Amol", "Mechanical",500000,"Male",30));
		list.add(new Employee(4, "Abhijeet", "E&TC",300000,"Male",26));
		list.add(new Employee(5, "Rupali", "MCA",40000,"Female",29));
		list.add(new Employee(2, "Pradnya", "IT",20000,"Female",28));
		
		//max salary
//		Optional<Employee> empMaxSal=list.stream().max(Comparator.comparing(Employee::getSalary));
//		System.out.println(empMaxSal);
		//min salary
//		Optional<Employee> empMinSal=list.stream().min(Comparator.comparing(Employee::getSalary));
//		System.out.println(empMinSal);
//		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
//		System.out.println(collect);
//		reverse of sorted list by salary
//		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
//		System.out.println(collect);
		//second highest salary:
//		Optional<Employee> secondHigest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e->System.out.println(e));
//		System.out.println(secondHigest);
		//number of emp in each department
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(collect);
//		Map<String, Long> collect = list.stream().map(s->s.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
//		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(map);
//		Optional<Employee> map=list.stream().max(Comparator.comparing(Employee::getSalary));
//		System.out.println(map);
//		List<Employee> l=list.stream().sorted((o1, o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
//		System.out.println(l);
		//remove duplicates
//		list.stream().map(Employee::getAge).distinct().forEach(i->System.out.println(i));
//		Map<String, Double> map=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(map);
		
		
	}
}
