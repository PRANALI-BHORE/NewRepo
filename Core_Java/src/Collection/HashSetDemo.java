package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import Java8.printEmployeeDetails.Employee;

public class HashSetDemo {
	int id;
	String name;
	String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public HashSetDemo(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public HashSetDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetDemo other = (HashSetDemo) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
}

class Demo{
	
	public static void main(String[] args) {
		HashSetDemo hs1=new HashSetDemo(101, "Pranali", "IT");
		HashSetDemo hs2=new HashSetDemo(101, "Pranali", "IT");
		
		Set<HashSetDemo> set1=new HashSet();
		set1.add(hs1);
		set1.add(hs2);
		System.out.println(set1.size());
		System.out.println(set1);//size=1 if equals and hashcode overridden and size=2 if not overridden
		
		String s1=new String("pranali");
		String s2=new String("pranali");
		Set<String> set2=new HashSet();
		set2.add(s1);   set2.add(s2);
		System.out.println(set2.size()); //size=1 coz string already has equals and hashcode overridden
		System.out.println(set2);
		
		Map<String, Integer> map2=new HashMap<>();
		map2.put(s1, 1);
		map2.put(s2, 1);
		System.out.println(map2.size());//size=1 coz string already has equals and hashcode overridden
		System.out.println(map2);
		
		Map<HashSetDemo, Integer> map1=new HashMap<>(); //size=1 if equals and hashcode overridden and size=2 if not overridden
		map1.put(hs1, 1);
		map1.put(hs2, 1);
		System.out.println(map1.size());
		System.out.println(map1);
		
		System.out.println();
		
	}
	
	
}
