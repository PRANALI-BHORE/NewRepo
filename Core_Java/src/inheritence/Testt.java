package inheritence;

interface Aaac{
	void m1();
}


interface Bbbc{
	void m1();
	void m2();
}

public class Testt implements Aaac,Bbbc{
	
	
	public static void main(String[] args) {
		Testt t=new Testt();
		t.m1();
		t.m2();
	
  }

	@Override
	public void m1() {
		System.out.println("in methos m1..");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("in method m2..");
		
	}
}
