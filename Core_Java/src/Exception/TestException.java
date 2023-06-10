package Exception;

import java.io.IOException;

public class TestException {
	void m() {  
//	    throw new java.io.IOException("device error");
	  }  
	  void n() throws Exception{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
	   TestException obj=new TestException();  
	   obj.p();  
	   System.out.println("normal flow");  
	
	  }
}
