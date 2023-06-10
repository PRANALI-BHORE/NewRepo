package String;

public class StringCount {
	public static void main(String[] args) {
		String s="Hi, I am Pranali! How are you?";
		int count=0;
		
//		Character ar[]= {'.',',','!','?'};

		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ' && s.charAt(i)!=',' && s.charAt(i)!='!' && s.charAt(i)!='?') {
				count++;
			}
		}
		
		System.out.println("count of string is: "+count);
	}
}
