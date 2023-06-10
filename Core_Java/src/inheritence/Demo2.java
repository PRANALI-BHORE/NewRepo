package inheritence;

public class Demo2 {
	public static void main(String[] args) {
		C c=new C();
		c.m1();
		
		D d=new D();
		d.m1();
		
		C c2=new D();
		c2.m1();
	}
}

class C{
	void m1() {
		System.out.println("C-m1()");
	}
}

class D extends C{
	void m1() {
		System.out.println("D-m1()");
	}
}