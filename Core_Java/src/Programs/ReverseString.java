package Programs;

public class ReverseString {
	public static void main(String[] args) {
		String s="pranali",rev="";
		//method 1
		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(s.charAt(i)); 
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//method 2
		StringBuffer sb=new StringBuffer(s);
//		sb.reverse();
		System.out.println(sb.reverse().toString());
		Integer x=10;
		Long y=10L;
		String ss="10";
//		System.out.println(x==y);
//		System.out.println(ss.equals(x));
//		System.out.println(ss==x);
//		System.out.println(x.equals(y));
	}
}
