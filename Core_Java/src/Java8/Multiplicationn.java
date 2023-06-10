package Java8;

@FunctionalInterface
public interface Multiplicationn {
	public int multiply(int a,int b);
	
}

class Test {
	public static void main(String[] args) {
		Multiplicationn m=(a,b)->a*b;
			System.out.println(m.multiply(3,2));
			
	}

	
	
}
