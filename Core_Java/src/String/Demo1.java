package String;

public class Demo1 {
	public static void main(String[] args) {
		String s="pranali";
		StringBuffer sbf=new StringBuffer("pranali");
		StringBuffer sbf2=new StringBuffer(s);
		StringBuffer sbf3=new StringBuffer("pranali");
		String s1=new String("pranalii");
		String s2=new String("pranali");
		String ss1="pranalii";
		String ss2="pranali";
//		ss2=ss2+"i";
//		System.out.println(s.equals(sbf)); //false
//		System.out.println(s.equals(sbf2)); //false
//		System.out.println(sbf.equals(sbf2)); //false
//		System.out.println(sbf==sbf2);        //false
//		System.out.println(s1.equals(s2));    //true
//		System.out.println(s1==s2);           //false
//		System.out.println(sbf.hashCode());
//		System.out.println(sbf2.hashCode());
//		System.out.println(sbf3.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s.hashCode());
//		System.out.println(ss1==ss2);
//		System.out.println(ss1.equals(ss2));
//		System.out.println("ss1: "+ss1.hashCode()+"  ss2: "+ss2.hashCode());
		s=s.toUpperCase();
		String p="PRANALI";
		System.out.println(s==p);
	}
}
