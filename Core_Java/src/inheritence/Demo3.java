package inheritence;

public class Demo3 {
	public void add() {
		System.out.println("demo3");
	}
}

interface A1{
	public void add();
	
//	public void m1();
	default void m2() {
		System.out.println("m2-A1");
	}
}

interface B1{
//	public void m1();
	public void add();
	
}

class Test implements A1,B1{
	public static void main(String[] args) {
		Test t=new Test();
		t.add();
		t.m2();
		A1 a1=new Test();
	}

	@Override
	public void add() {
		System.out.println("hii");
		
	}
	
	
	
}