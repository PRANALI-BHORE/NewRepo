package Java8;

public class RemoveSpaceNumUppercase {
	public static void main(String[] args) {
		String s="  abcXYZ123  ";
		
		s=s.trim().toUpperCase().replace("[0-9]","").replace("A", "z");
		System.out.println(s);
		s=s.substring(0,3).toUpperCase()+s.substring(3).toLowerCase();
		System.out.println(s);
	}
}
