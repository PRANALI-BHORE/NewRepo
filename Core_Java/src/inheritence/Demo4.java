package inheritence;

import java.util.HashMap;

public class Demo4 {
	public void test() {
		System.out.println("m1=test");
	}
	public void m1() {
		System.out.println("m1");
	}
}

class Demo5 extends Demo4{
	public void test() {
		System.out.println("Demo5=test");
	}
	
	public void test2() {
		System.out.println("Demo5=test2");
	}
}

class Test4{
	public static void main(String[] args) {
		Demo4 d=new Demo5();
		d.test();
//		d.test2();
//		d.m1();
//		Demo5 b=new Demo5();
//		b.m1();
//		b.test();
		Demo4 d4=new Demo4();
		d4.test();
		
		HashMap<K, V>
	}
}