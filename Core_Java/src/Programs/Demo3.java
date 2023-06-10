package Programs;

public class Demo3 {
	public static void main(String[] args) {
		String s1="10";
		String s2="10";
		int x=10;
		int y=10;
		Integer x1=10;
		Integer y1=10;
//		System.out.println(s1==s2); //true
//		System.out.println(s1==x);  //incompatible error
//		System.out.println(s1.equals(x)); //false
//		System.out.println(x.equals(s1));
		System.out.println(x==y);    //true
		System.out.println(x1==y1);    //true
		System.out.println(x1.hashCode());
		System.out.println(y1.hashCode());
//		System.out.println(x.equals(y));  //error
//		System.out.println(x1.equals(y1)); // true
		
		
	}
}
