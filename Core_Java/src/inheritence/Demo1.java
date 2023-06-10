package inheritence;

public class Demo1 {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.x);
		A a=new A();
		System.out.println(a.x);
		A a1=new B();
		System.out.println(a1.x);
	}
}

class A{
	int x=10;
}

class B extends A{
	int x=20;
}
