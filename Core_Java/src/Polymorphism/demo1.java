package Polymorphism;

public class demo1 {
	public static void m1(int i) {
		System.out.println("int");
	}

	public static void m1(String i) {
		System.out.println("String");
	}

	public static void m1(char i) {
		System.out.println("char");
	}
}

class test{
	
	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.m1(null);
//		d1.m1('a');
	}
}