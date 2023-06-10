package Exception;

public class twoExceptions {
	public static void main(String[] args) {
		try {
			int i=10/0;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
//		catch(ArithmeticException e){
//			e.printStackTrace();
//			
//		}
	}
}
