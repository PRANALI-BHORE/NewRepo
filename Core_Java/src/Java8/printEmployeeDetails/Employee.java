package Java8.printEmployeeDetails;

import java.util.List;

public class Employee {
	int id;
	String name;
	String department;
	int salary;
	String gender;
	int age;
	List<String> city;
	
	public Employee(int id, String name, String department, int salary, String gender,int age,List<String> city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.gender=gender;
		this.age=age;
		this.city=city;
	}
	
	
	
	public Employee(int id, String name, String department, int salary, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}



	public List<String> getCity() {
		return city;
	}



	public void setCity(List<String> city) {
		this.city = city;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
