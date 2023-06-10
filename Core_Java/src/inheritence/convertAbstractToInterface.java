package inheritence;

public abstract class convertAbstractToInterface {
	abstract void m1();
}

class test extends convertAbstractToInterface{
	
	public static void main(String[] args) {
		test t=new test();
		t.m1();
	}

	@Override
	void m1() {
		System.out.println("hello");
		
	}
}
